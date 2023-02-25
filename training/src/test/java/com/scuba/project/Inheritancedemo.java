package com.scuba.project;

public class Inheritancedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SubClassB obj =new SubClassB();
    obj.foo();
    //obj.baa();
	}

}
/*class SuperClassA{
	public void foo() {
		System.out.println("Its a Super class A");
	}
}
class SubClassB extends SuperClassA{
	public void baa() {
		System.out.println("Its a Sub class B");
	}
}
*/
class SuperClassA{
	public void foo() {
		System.out.println("Its a Super class A");
	}
}
class SubClassB extends SuperClassA{
	public void foo() {
		System.out.println("Its a Sub class B");
	}
}