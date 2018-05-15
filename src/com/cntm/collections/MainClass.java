package com.cntm.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClass {

	public static void main(String[] args) 
	{
		CollectionClass cc = new CollectionClass("abc",10000.00,23,"CS");
		CollectionClass cc2 = new CollectionClass("xyz",15000.00,23,"CS");
		CollectionClass cc3 = new CollectionClass("pqr",15000.00,23,"CS");
		CollectionClass cc4 = new CollectionClass("pqr",15000.00,23,"CS");
		List<CollectionClass> list = new ArrayList<CollectionClass>();
		list.add(cc);
		list.add(cc2);
		list.add(cc3);
		/**
		 * Hashcode-equals Contract
		 * new Reference is created.cc4 is same as that of cc3 but if hashcode and equals 
		 * are not overridden then it will be false
		 * OtherWise it is true
		 */
		System.out.println(list.contains(cc4));
		
		
/*			System.out.println(list);
			for (CollectionClass colclass : list) {     
				if (colclass.equals(cc)) {
					list.remove(colclass);	//ConcurrentModificationException bcz of list 
				}
				System.out.println(list);
	}*/
			 Iterator<CollectionClass> itr = list.iterator();
			 System.out.println(list);
			 while(itr.hasNext())
			 {
				 if(itr.next().equals(cc2))
				 {
					 itr.remove();
					 break;
				 }
				
			 }
			 System.out.println(list);
			

	}
}
