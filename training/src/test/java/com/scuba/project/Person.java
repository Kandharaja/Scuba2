package com.scuba.project;

public class Person implements Students, Youtuber {

	public static void main(String[] args) {
		Person obj = new Person();
		obj.study();
		obj.makeVideo();
		
	}
	
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Hi, I am studying");
		
	}

	@Override
	public void makeVideo() {
		// TODO Auto-generated method stub
		System.out.println("Hi, I am making videos please do not disturb");
		
	}

}
