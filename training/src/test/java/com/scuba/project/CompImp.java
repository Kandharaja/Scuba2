package com.scuba.project;
import java.util.Comparator;

public class CompImp implements Comparator<Integer>
{

	//@Override
	public int compare(Integer o1, Integer o2) {
		
		if (o1%10>o2%10)
			return 1;
		
		return -1;
	}


//import comparator class


//comparator is an interface

	

}