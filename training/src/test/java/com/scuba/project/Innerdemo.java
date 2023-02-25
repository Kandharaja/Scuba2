package com.scuba.project;


class Outer
{
	int i=1;
	String name="Vijay";
	
	void show() {
		System.out.println("Inside show");
		
	}
	class Inner
	{
		int j=1;
		String name="kumar";
		
		void display() {
			System.out.println("Inside display");	
		}
	}
}
public class Innerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Outer obj = new Outer();
    obj.show();
    
    Outer.Inner obj2 = obj.new Inner();
    obj2.display();
    
    
	}

}
