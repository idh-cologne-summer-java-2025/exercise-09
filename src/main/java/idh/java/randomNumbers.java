package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class randomNumbers {
	public static void main(String[] args) {
		System.out.println(Experiment(new TreeList<Integer>()));
		System.out.println(Experiment(new LinkedList<Integer>()));
		System.out.println(Experiment(new ArrayList<Integer>()));
	}
	
	static long Experiment(List<Integer> list) {
		Random random = new Random();
		for (int i=0; i<100000; i++) list.add(random.nextInt());
		long Beginn = System.currentTimeMillis();
		for (int i=0; i<10000; i++) list.add(random.nextInt(list.size()), random.nextInt());
		long Stop = System.currentTimeMillis();
		long Summe = Stop-Beginn;
		return Summe;
	}
}
