package profiler;

import soot.jimple.Stmt;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cheyulin on 10/15/16.
 */

public class StatementMarker {
    private static HashMap<String, HashMap<Integer, Integer>> nameVertexInfoMap;
    private static HashMap<String, HashMap<Integer, Stmt>> nameStmtInfoMap;
    private static HashMap<String, HashMap<profiler.YcheEdge, Integer>> nameEdgeInfoMap;
    private static HashMap<String, Integer> nameLastInstructionMap;


    static {
        nameVertexInfoMap = new HashMap<>();
        nameStmtInfoMap = new HashMap<>();
        nameEdgeInfoMap = new HashMap<>();
        nameLastInstructionMap = new HashMap<>();
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

    public static synchronized void display() {
        System.out.println("display");
    }

    public static synchronized void mark(String className, int index) {
        if (!nameVertexInfoMap.containsKey(className)) {
            nameVertexInfoMap.put(className, new HashMap<Integer, Integer>());
        }
        HashMap indexCountMap = nameVertexInfoMap.get(className);
        if (!indexCountMap.containsKey(index)) {
            indexCountMap.put(index, 0);
        }
        indexCountMap.put(index, indexCountMap.get(index));

        if (!nameLastInstructionMap.containsKey(className)) {
            nameLastInstructionMap.put(className, index);
            nameEdgeInfoMap.put(className, new HashMap<profiler.YcheEdge, Integer>());
            return;
        } else {
            HashMap<profiler.YcheEdge, Integer> edgeCountMap = nameEdgeInfoMap.get(className);
            profiler.YcheEdge edge = new profiler.YcheEdge(nameLastInstructionMap.get(className), index);
            if (!edgeCountMap.containsKey(edge)) {
                edgeCountMap.put(edge, 0);
            }
            edgeCountMap.put(edge, edgeCountMap.get(edge) + 1);
            nameLastInstructionMap.put(className, index);
        }

    }
}
