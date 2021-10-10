package org.list;

import java.util.ArrayList;
import java.util.List;

public class Lists {
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>() ;
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(50);
		li.add(10);
		
		
        List<Integer> li1 = new ArrayList<Integer>() ;
		
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		li1.add(10);
		
		int size = li.size();
		System.out.println(size);
		
		boolean add = li.add(30);
		System.out.println(add);
	
	
		
	}
	
	
			

}