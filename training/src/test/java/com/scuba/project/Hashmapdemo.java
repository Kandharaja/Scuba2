package com.scuba.project;

import java.util.HashMap;
import java.util.Map;

public class Hashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer,String> myhashmap = new HashMap<Integer,String>();
    myhashmap.put(1, "abc");
    myhashmap.put(2, "abc");
    myhashmap.put(3, "abc");
    myhashmap.put(4, "abc");
    System.out.println("Display HashMap element");
    
    for(Map.Entry a: myhashmap.entrySet()) {
    	System.out.println(a.getKey() +"" + a.getValue());
    }
	}

}
