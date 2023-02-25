package com.scuba.project;




public class ExceptionActivity {
	  public static void main(String[] args) {
	    try {
	      int[] myNumbers = {1, 2, 3};
	      System.out.println(myNumbers[10]);
	    } catch (Exception e) {
	      System.out.println("Something");
	    } finally {
	      System.out.println("The 'try catch' is finished.");
	    }
	  }
	}