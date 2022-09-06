package com.bridzelab.StacksAndQueues;

public class StackMain
{
	// main method all program execute in main method
	public static void main(String[] args)
	{
		
         // create object for Stack class.
         //object name is stackoperation
         Stack stackoperation = new Stack();

        
         //calling the method from object name
         //objectname.methodname();
        stackoperation.push(56);   		//push operation add 1st element

        stackoperation.push(30);   		//push operation add 2nd element

        stackoperation.push(70);   		//push operation add 3rd element
        
        stackoperation.printStack();    // print operation

    }


}


