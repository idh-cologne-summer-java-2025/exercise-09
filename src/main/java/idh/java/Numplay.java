package idh.java;

import java.util.*;
import org.apache.commons.collections4.list.TreeList;

public class Numplay {

    private static final int INITIAL_SIZE = 100_000;
    private static final int INSERTIONS = 10_000;

    public static void main(String[] args) {
        System.out.println("Vergleich TreeList vs LinkedList vs ArrayList\n");

        runExperiment(new TreeList<>(), "TreeList");
        runExperiment(new LinkedList<>(), "LinkedList");
        runExperiment(new ArrayList<>(), "ArrayList");
    }

    private static void runExperiment(List<Integer> list, String name) {
        Random rand = new Random();

        // Liste mit 100.000 Zufallszahlen befüllen
        for (int i = 0; i < INITIAL_SIZE; i++) {
            list.add(rand.nextInt());
        }

        // Zeitmessung vor dem Einfügen
        long start = System.nanoTime();

        // 10.000 weitere Zufallszahlen an zufälligen Stellen einfügen
        for (int i = 0; i < INSERTIONS; i++) {
            int pos = rand.nextInt(list.size());
            list.add(pos, rand.nextInt());
        }

        // Zeitmessung nach dem Einfügen
        long end = System.nanoTime();

        double durationSec = (end - start) / 1_000_000_000.0;
        System.out.printf("%s: %.3f Sekunden%n", name, durationSec);

    }
}
