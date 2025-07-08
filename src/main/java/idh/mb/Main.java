package idh.mb;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.collections4.list.TreeList;

public class Main {

	public static void main(String[] args) {
		ListTest  lt = new ListTest();
		List<Integer> AL = new ArrayList<Integer>();
		List<Integer> LL = new LinkedList<Integer>();
		List<Integer> TL = new TreeList<Integer>();
		
//		ListIterator <Integer >alLit = AL.listIterator(); 
		
		//Fill the lists with 100000 int values
		lt.timeTest(AL);
		lt.timeTest(LL);
		lt.timeTest(TL);
		
//		Insert 10000 more values into the list at random indices
		lt.listInsertion(AL);
		lt.listInsertion(LL);
		lt.listInsertion(TL);
		
	}

}
