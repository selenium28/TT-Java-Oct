package coll;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("Akshay");
		list.add(20.00);
		list.add(100);
		list.add(true);
		list.add(33.33);
		
		System.out.println(list.size());
		
		list.remove(2);
		
		System.out.println(list.size());
		System.out.println(list.get(3));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));;
		}
		
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(100);
		intList.add(200);
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("Akshay");
		
	}

}
