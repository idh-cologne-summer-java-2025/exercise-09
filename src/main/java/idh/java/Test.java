package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.apache.commons.collections4.list.TreeList;

public class Test {
    
    
	public static void timer(List<Integer> list, String name) { 
		Random random = new Random(0); // Initializes the random number generator.
		for (int i = 0; i < 100000; i++)
		{
			list.add(random.nextInt()); // Adds a random integer to the list.
		}
		
		long startTime = System.currentTimeMillis(); // Records the start time of the timed operation.
		for (int i = 0; i < 10000; i++) 
		{ 
			list.add(random.nextInt(list.size()), random.nextInt()); // Inserts a random integer at a random index in the list
		}
		long endTime = System.currentTimeMillis(); // Records the end time of the timed operation
		
		System.out.println("The " + name + " took " + String.valueOf(endTime - startTime) + " ms."); // Prints the class name and time taken to perform the insertions
	}
	
	public static void main(String[] args) { 
		List<Integer> treeList = new TreeList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
        List<Integer> arrayList = new ArrayList<Integer>();
		timer(treeList, "TreeList"); 
		timer(linkedList, "LinkedList"); 
		timer(arrayList, "ArrayList");
	} 


}