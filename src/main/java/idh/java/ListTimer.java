package idh.java;

import java.util.*;
import org.apache.commons.collections4.list.TreeList;

public class ListTimer {

    private static final int iniSize = 100000;
    private static final int addSize = 10000;

    public static void main(String[] args) {
        exTimer(new TreeList<>(), "TreeList");
        exTimer(new LinkedList<>(), "LinkedList");
        exTimer(new ArrayList<>(), "ArrayList");
    }

    private static void exTimer(List<Integer> list, String type) {
        Random rand = new Random();

        // fill list with iniSize no. of random integers
        for (int i = 0; i < iniSize; i++) {
            list.add(rand.nextInt());
        }

        // system clock prior to random no. insert
        long start = System.nanoTime();

        // add addSize no. of integers at random positions in list
        for (int i = 0; i < addSize; i++) {
            int pos = rand.nextInt(list.size());
            list.add(pos, rand.nextInt());
        }

        // system clock after random no. insert
        long end = System.nanoTime();

        double durSec = (end - start) / 1000000000.0;
        System.out.printf("%s: %.3f sec%n", type, durSec);
    }

}
