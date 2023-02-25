package com.scuba.project;

public class Encapsulationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     student s1 = new student();
     student s2 = new student();
     s1.setRollno(100);
     System.out.println(s1.getRollno());
	}

}
class student{
	int rollno;
	String name;
	
	public void setRollno (int r) {
		rollno=r;
	}
	public int getRollno() {
		return rollno;
	}
}