package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class ListTest {
	public static void main (String arggggg[]) {
		Random random = new Random(0);
		TreeList<Integer> drei = new TreeList<Integer>();
		LinkedList<Integer> zwei = new LinkedList<Integer>();
		ArrayList<Integer> eins = new ArrayList<Integer>();
		
		for (int i = 0;i<100000;i++) {
		drei.add(random.nextInt());
		zwei.add(random.nextInt());
		eins.add(random.nextInt());
		}
		
		timeTrial(drei, "treelist", random);
		timeTrial(zwei, "Linkedlist", random);
		timeTrial(eins, "Arraylist", random);
		}

	private static void timeTrial(List<Integer> list, String listname, Random random) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i<10000;i++) {
			list.add(random.nextInt(list.size()), random.nextInt());
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Der "+listname+"-Test hat " + String.valueOf(endTime - startTime) + " Millisekunden gedauert.");
		
	}
	
	
}
