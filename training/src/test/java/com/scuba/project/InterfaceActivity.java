package com.scuba.project;

public class InterfaceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//import java.io.*;

//A simple interface
interface In1 {

 // public, static and final
 final int a = 10;

 // public and abstract
 void display();
}

//A class that implements the interface.
class TestClass implements In1 {

 // Implementing the capabilities of
 // interface.
 public void display(){
   System.out.println("fer");
 }

 // Driver Code
 public static void main(String[] args)
 {
     TestClass t = new TestClass();
     t.display();
     System.out.println(a);
 }
}