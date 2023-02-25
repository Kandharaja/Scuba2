package com.scuba.project;

public class Overloadingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Loading obj = new Loading();
    obj.sum(4,7);
    obj.sum(3,4,8);
	}

}
class Loading{
	public void sum(int a, int b) {
		int M=a+b;
		System.out.println("Sum is " + M);
	}
	public int sum(int a, int b, int c) {
		int N=a+b+c;
		System.out.println("Sum is " + N);
		return N;
}
}