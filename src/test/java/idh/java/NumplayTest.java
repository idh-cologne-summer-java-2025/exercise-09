package idh.java;

import org.apache.commons.collections4.list.TreeList;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumplayTest {

    @Test
    public void testTreeListInsertPerformance() {
        List<Integer> list = new TreeList<>();
        Random rand = new Random();

        for (int i = 0; i < 100_000; i++) {
            list.add(rand.nextInt());
        }

        long start = System.nanoTime();

        for (int i = 0; i < 10_000; i++) {
            int pos = rand.nextInt(list.size());
            list.add(pos, rand.nextInt());
        }

        long duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("TreeList insert time: " + duration + " ms");

        assertTrue(duration < 2000, "TreeList insert took too long!");
    }
}
