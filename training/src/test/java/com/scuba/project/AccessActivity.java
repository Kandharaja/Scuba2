
//default
package com.scuba.project;

//public class AccessActivity {

	//public static void main(String[] args) {
		// TODO Auto-generated method stubclass Logger {
	    
	 //       System.out.println("This is a message");

	//}

//}

//Private
/*package com.scuba.project;
class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
public class AccessActivity {
    public static void main(String[] main){
        Data d = new Data();

        // access the private variable using the getter and setter
        d.setName("Programiz");
        System.out.println(d.getName());
    }
}*/

//protected

/*class Animal {
    // protected method
    protected void display() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    public static void main(String[] args) {

        // create an object of Dog class
        Dog dog = new Dog();
         // access protected method
        dog.display();
    }
}*/

//Public

public class AccessActivity {
    // public variable
    public int legCount;

    // public method
    public void display() {
        System.out.println("I am an animal.");
        System.out.println("I have " + legCount + " legs.");
    }


// Main.java
//public class Main {
    public static void main( String[] args ) {
        // accessing the public class
    	AccessActivity animal = new AccessActivity();

        // accessing the public variable
        animal.legCount = 4;
        // accessing the public method
        animal.display();
    }
}
