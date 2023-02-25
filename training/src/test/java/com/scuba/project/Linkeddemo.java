package com.scuba.project;

public class Linkeddemo {
	//Represent a node of the linked list    
    class Node{    
        int data;    
        Node next;    
  public Node(int data) {    
            this.data = data;    
            this.next = null;    }  }    
    //Represent the head and tail of the linked list    
    public Node head = null;    
    public Node tail = null; 
public void addNode(int data) {    

	//Create a new node    
    Node newNode = new Node(data);    
        
    //Checks if the list is empty    
    if(head == null) {    
        //If list is empty, both head and tail will point to new node    
        head = newNode;    
        tail = newNode;     }
else {    
        //newNode will be added after tail such that tail's next will point to newNode    
        tail.next = newNode;    //adding new node after tail
        //newNode will become new tail of the list    
        tail = newNode;    // removes tail from previous node and newnode becomes tail
    }   }
//display() will display all the nodes present in the list    
public void display() {    
    //Node current will point to head    
    Node current = head;    
        if(head == null) {    
        System.out.println("List is empty");    
        return;    }    
    System.out.println("Nodes of linked list: ");    
    while(current != null) {    
        //Prints each node by incrementing pointer    
        System.out.print(current.data + " ");    
        current = current.next;   }    
    System.out.println();    
} 
public static void main(String[] args) {    
    Linkeddemo sList = new Linkeddemo();    
   //Add nodes to the list    
 sList.addNode(1);    
 sList.addNode(2);    
 sList.addNode(3);    
 sList.addNode(4);   
 sList.addNode(5); 
 sList.addNode(7); 
 sList.addNode(9); 
    //Displays the nodes present in the list    
 sList.display();    
}    }   




