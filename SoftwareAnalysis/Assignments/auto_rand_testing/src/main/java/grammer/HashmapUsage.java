package grammer;

/**
 * Created by cheyulin on 10/16/16.
 */

import java.util.*;

public class HashmapUsage {
    public static void main(String[] args) {
        HashMap<String, Integer> my_map=new HashMap<>();
        my_map.put("yche",0);
        for(int i=0;i<10;i++)
            my_map.put("yche",my_map.get("yche")+1);
        System.out.println(my_map.get("yche"));

        HashMap<String, HashMap<Integer, Integer>> nameInstructionInfoMap;
        nameInstructionInfoMap= new HashMap<>();
    }
}
