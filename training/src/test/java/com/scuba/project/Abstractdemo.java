package com.scuba.project;

public class Abstractdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cphone c = new Cphone();
		c.call();
		c.music();
		
	}
}
	abstract class Aphone{
		public void call() {
			System.out.println("Calling... ");
		}
		public void Music() {
			System.out.println("Music... ");
		}
		public abstract void music();
		public abstract void camera();
		public abstract void storage();
	}
		
		abstract class Bphone extends Aphone{	
			public void Music() {
				System.out.println("Music... ");
			}
		}
		class Cphone extends Bphone {
		public void call() {
			System.out.println("Calling... ");
		}
		public void music() {
			System.out.println("Music... ");
		}
			public void camera() {
				System.out.println("Camera... ");
			}
			public void storage() {
				System.out.println("Storage... ");
			}
		}
	
	
