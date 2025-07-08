package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.apache.commons.collections4.list.TreeList;


public class Test {
	
public static void timer (List<Integer>list, String name) {
	Random random = new Random(0);
	for (int i = 0; i < 100000; i++) 
	{
		list.add(random.nextInt());
	}
	long startTime = System.currentTimeMillis();
	for (int i = 0; i < 10000; i++) 
	{
		list.add(random.nextInt(list.size())); random.nextInt(); /////////
	}
	long endTime = System.currentTimeMillis();
	System.out.println("The " + name + "took " + String.valueOf(endTime - startTime) + " ms.");
}
public static void main (String[]args) {
	
	List<Integer> arrayList = new ArrayList<>();
	List<Integer> linkedList = new LinkedList<>();
	List<Integer> treeList = new TreeList<>();
	timer(treeList, "TreeList");
	timer(linkedList, "LinkedList");
	timer(arrayList, "ArrayList");
	
	}
	
}
