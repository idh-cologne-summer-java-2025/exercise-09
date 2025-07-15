package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.apache.commons.collections4.list.TreeList;

public class Experiment {

    public static void main(String[] args) {
        measurePerformance(new ArrayList<>(), "ArrayList");
        measurePerformance(new LinkedList<>(), "LinkedList");
        measurePerformance(new TreeList<>(), "TreeList");
    }

    private static void measurePerformance(List<Integer> list, String listType) {
        Random random = new Random();

        // 100.000 zufällige Zahlen einfügen
        for (int i = 0; i < 100_000; i++) {
            list.add(random.nextInt());
        }

        long start = System.nanoTime();

        // 10.000 Zahlen an zufälligen Stellen einfügen
        for (int i = 0; i < 10_000; i++) {
            int position = random.nextInt(list.size());
            list.add(position, random.nextInt());
        }

        long end = System.nanoTime();
        long durationMillis = (end - start) / 1_000_000;

        System.out.println(listType + " dauerte: " + durationMillis + " ms");
    }
}
