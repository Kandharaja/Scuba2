package com.scuba.project;

/*public class StaticActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
class StaticActivity{  
	   int rollno;//instance variable  
	   String name;  
	   static String college ="ITS";//static variable  
	   //constructor  
	   StaticActivity(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   //method to display the values  
	   void display (){System.out.println(rollno+" "+name+" "+college);}  
	 
	//Test class to show the values of objects  
//	public class TestStaticVariable1{  
	 public static void main(String args[]){  
		 StaticActivity s1 = new StaticActivity(111,"Raja");  
		 StaticActivity s2 = new StaticActivity(222,"Ram");  
	 //we can change the college of all objects by the single line of code  
	 //Student.college="BBDIT";  
	 s1.display();  
	 s2.display();  
	 }  
	}  