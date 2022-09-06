/*
* purpose=Ability to create a Queue of
			56->30->70
* @author= sushmitha
* @since=07-10-2022
*/
package com.bridzelab.StacksAndQueues;

	public class Queue 
	{ 
		private Node front, rear;
		private int currentSize; // number of items

		//class to define linked node
		private class Node
		{
			int data;
			Node next;
		}

			// create constructor name as Queue.
			public Queue() 
			{
				front = null;
				rear = null;
				currentSize = 0;
			}
			
			/* create a method isEmpty
			 * they are boolean type that means Returns true if the queue is empty, else false.
			 */
			public boolean isEmpty()
			{
				return (currentSize == 0);
			}
			

			/*
			 * create enqueue method and pass the parameter
			 * Add data to the end of the list.
			 */
			public void enqueue(int data)
			{
				Node oldRear = rear;
				rear = new Node();
				rear.data = data;
				rear.next = null;

				if (isEmpty()) 
				{
					front = rear;
				}
				else 
				{
					oldRear.next = rear;
				}
					currentSize++;
					System.out.println(data + " added to the queue");
		    }


	}
