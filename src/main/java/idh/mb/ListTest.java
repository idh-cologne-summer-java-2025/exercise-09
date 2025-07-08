package idh.mb;

import java.util.List;
import java.util.ListIterator;

public class ListTest {
//List<Integer> al = new ArrayList<Integer>(1000000);
//List<Integer> ll = new LinkedList<Integer>(); 
//List<Integer> tl = new TreeList<Integer>();

public List<Integer> timeTest(List<Integer>l) {
	//Fill List with Integers from 0-99
	long before1 = System.currentTimeMillis();
	for(int i=0; i<100000;i++) {
		l.add((int) Math.random()*10);
		}
	long after1 = System.currentTimeMillis();
	long duration1 = after1 - before1;
	System.out.println("Filling the List took " + duration1 + " miliseconds.");
	this.listInsertion(l);
	//add 10000 Integers at random spots
//	long before2 = System.currentTimeMillis();
//	//throws a java.util.ConcurrentModificationException
//	for(Integer i : l) { 
//		l.add((int) Math.random()*10, i);
//	}
//	long after2 = System.currentTimeMillis();
//	long duration2 = after2 - before2;
//	System.out.println("Adding 10000 values took " + duration2 + "miliseconds.");
	return l;
}

	public int listInsertion(List<Integer> l) {
		ListIterator <Integer>lit = l.listIterator();
		long before = System.currentTimeMillis();
		int counter = 0;
		while(lit.hasNext()) {
			l.add((int)Math.random()*10, null);
			counter++;
			if(counter>1000) {
				System.out.println("Process concluded.");
				long after = System.currentTimeMillis();
				int timespan = (int)after - (int)before;
				System.out.println("Adding took " + timespan + " seconds");
				return timespan;
			}
		}
		return 0;
	}
}

