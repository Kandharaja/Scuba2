package com.scuba.project;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int count=0;
     Pattern p=Pattern.compile("Kous");
     Matcher m=p.matcher("KoushKoushickKous");
     while(m.find())
     {
    	 count++;
    	 System.out.println(m.start()+"__"+m.end()+"__"+m.group());
    	 
     }
     System.out.println("The Total Occurance are"+ count);
	}

}
