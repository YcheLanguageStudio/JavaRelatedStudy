package profiler;

import java.util.*;

/**
 * Created by cheyulin on 10/15/16.
 */

public class StatementMarker {
    private static HashMap<String, HashMap<Integer, Integer>> nameVertexInfoMap;
    private static HashMap<String, HashMap<profiler.YcheEdge, Integer>> nameEdgeInfoMap;
    private static HashMap<String, Integer> nameLastIfStmtMap;
    private static boolean isIfLastStm;

    static {
        nameVertexInfoMap = new HashMap<>();
        nameEdgeInfoMap = new HashMap<>();
        nameLastIfStmtMap = new HashMap<>();
        isIfLastStm = false;
    }

    public static synchronized void reportCodeCoverage() {
        for (Map.Entry<String, HashMap<Integer, Integer>> outerEntry : nameVertexInfoMap.entrySet()) {
            System.out.println("ClassName:" + outerEntry.getKey() + ",Covered Instruction:" + outerEntry.getValue().size());
        }
        for (Map.Entry<String, HashMap<profiler.YcheEdge, Integer>> outerEntry : nameEdgeInfoMap.entrySet()) {
            System.out.println("ClassName:" + outerEntry.getKey() + ",Covered Branch:" + outerEntry.getValue().size());
        }
    }

    public static synchronized void report() {
        for (Map.Entry<String, HashMap<Integer, Integer>> outerEntry : nameVertexInfoMap.entrySet()) {
            System.out.println("ClassName:" + outerEntry.getKey() + ",Covered Instruction:" + outerEntry.getValue().size());
            for (Map.Entry<Integer, Integer> innerEntry : outerEntry.getValue().entrySet()) {
                System.out.println(innerEntry.getKey());
            }
        }

        for (Map.Entry<String, HashMap<profiler.YcheEdge, Integer>> outerEntry : nameEdgeInfoMap.entrySet()) {
            System.out.println("ClassName:" + outerEntry.getKey() + ",Covered Edge:" + outerEntry.getValue().size());
            for (Map.Entry<profiler.YcheEdge, Integer> innerEntry : outerEntry.getValue().entrySet()) {
                System.out.println(innerEntry.getKey().toString());
            }
        }
    }

    public static synchronized void markStatement(String className, int index) {
        if (!nameVertexInfoMap.containsKey(className)) {
            nameVertexInfoMap.put(className, new HashMap<Integer, Integer>());
        }
        HashMap indexCountMap = nameVertexInfoMap.get(className);
        if (!indexCountMap.containsKey(index)) {
            indexCountMap.put(index, 0);
        }
        indexCountMap.put(index, indexCountMap.get(index));
    }

    public static synchronized void markIfStatement(String className, int index) {
        isIfLastStm = true;
        nameLastIfStmtMap.put(className, index);
    }

    public static synchronized void markBranch(String className, int index) {
        if (isIfLastStm) {
            isIfLastStm = false;
            if (!nameEdgeInfoMap.containsKey(className)) {
                nameEdgeInfoMap.put(className, new HashMap<YcheEdge, Integer>());
            }
            HashMap<profiler.YcheEdge, Integer> branchCountMap = nameEdgeInfoMap.get(className);
            YcheEdge edge = new YcheEdge(nameLastIfStmtMap.get(className), index);
            if (!branchCountMap.containsKey(edge)) {
                branchCountMap.put(edge, 0);
            }
            branchCountMap.put(edge, branchCountMap.get(edge) + 1);
        }
    }
}
