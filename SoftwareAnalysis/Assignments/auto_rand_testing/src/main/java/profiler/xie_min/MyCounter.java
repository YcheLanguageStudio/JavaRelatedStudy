package profiler.xie_min;

import java.io.*;
import java.util.*;


public class MyCounter {
    static String map_file = "map.txt";
    static String data_file = "data.txt";

    static Map<Integer, String> map = new HashMap<Integer, String>();

    public static synchronized void increase(String stmt, int id) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(data_file, true)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        map.put(id, stmt);
        out.print(id + " ");
        out.close();
    }

    public static synchronized void write() {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(map_file, "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            writer.println(entry.getKey() + " " + entry.getValue());
        }

        writer.close();
    }

    public static synchronized void report() {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(data_file, true)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("catched!");
        out.print("catched!");
        out.close();
    }

    public static synchronized void endl() {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(data_file, true)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        out.println();
        out.close();
    }
}
