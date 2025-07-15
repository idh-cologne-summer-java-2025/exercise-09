package idh.java;

import java.util.*;
import org.apache.commons.collections4.list.TreeList;

public class ListBenchmark {
    private static final int ELEMENT_COUNT = 100_000;

    public static void main(String[] args) {
    		// TODO Auto-generated method stub
        benchmarkList(new ArrayList<>(), "ArrayList");
        benchmarkList(new LinkedList<>(), "LinkedList");
        benchmarkList(new TreeList<>(), "TreeList");
    }

    private static void benchmarkList(List<Integer> list, String name) {
        System.out.println("Benchmarking " + name);

        long startInsert = System.nanoTime();
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            list.add(i);
        }
        long endInsert = System.nanoTime();
        System.out.printf("Insert time: %.2f ms%n", (endInsert - startInsert) / 1e6);

        long startDelete = System.nanoTime();
        for (int i = ELEMENT_COUNT - 1; i >= 0; i--) {
            list.remove(i);
        }
        long endDelete = System.nanoTime();
        System.out.printf("Delete time: %.2f ms%n", (endDelete - startDelete) / 1e6);
        System.out.println();
    }
}
