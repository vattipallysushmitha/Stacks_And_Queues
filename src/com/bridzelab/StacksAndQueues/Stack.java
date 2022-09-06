/*
purpose=Ability to create a Stack of
		56->30->70
* @author= sushmitha
* @since=07-10-2022
*/


package com.bridzelab.StacksAndQueues;

public class Stack 
{
	    Node top;
	    Node next;
	    
	    //Represent a node of the singly linked list
	    public class Node 
	    {
	        int data;
	        Node next;
	    }
	    public void Node()
	    {
	        this.top = null;
	    }
	    
	    
	    
	    /*
	      create a method name as push and passing parameter
	      the push is Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
	     */
	    
	    
	    public void push(int number)
	    {
	        Node node = new Node();
	        node.data = number;
	        node.next = top;
	        top = node;
	    }

	   
	    
	    // create method name as printStack
	    public void printStack()
	    {

	        Node node = top;

	        
	        // using while loop
	        // node is not null then print node data
	         
	        while (node != null) 
	        {

	            System.out.println(node.data);

	            node = node.next;

	        }
	    }



		
}
