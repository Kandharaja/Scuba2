package com.scuba.project;


import java.text.SimpleDateFormat;
import java.util.Date;

public class sampledate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Date date=new Date();
    System.out.println("toString() date is " + date);
    SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
    System.out.println("Format 1:    " + dateFormatter.format(date));
    
    
	}

}
