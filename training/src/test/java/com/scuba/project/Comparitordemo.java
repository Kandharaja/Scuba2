package com.scuba.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparitordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<Integer> values = new ArrayList<Integer>();
		 
		 values.add(105);
		 values.add(108);
		 values.add(774);
		 values.add(236);
		 values.add(551);
		 
		 Comparator<Integer> com = new CompImp();
		 
		 Collections.sort(values, com); //custom comparator to compare the contents of values array list
		 
		 for(int i: values)
		 {
			 System.out.println(i);
		 }
	 }
	}


