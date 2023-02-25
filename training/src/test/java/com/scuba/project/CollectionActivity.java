package com.scuba.project;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//import java.util.*;  
class TestJavaCollection1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("Ravi");//Adding object in arraylist  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
//Traversing list through Iterator  
Iterator<String> itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  