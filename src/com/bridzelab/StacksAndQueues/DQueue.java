package com.bridzelab.StacksAndQueues;

public class DQueue 
{
	 private Node front, rear;
     private int currentSize;

     /*
      * class to define linked node
      */
     private class Node 
     {
         int data;
         Node next;
     }

     // create constructor name as QueueUsingLinkedListMain.
     public DQueue() 
     {

         front = null;
         rear = null;
         currentSize = 0;
     }
     /*
      * create a method isEmpty
      * they are boolean type that means Returns true if the queue is empty, else false.
      */
     public boolean isEmpty()
     {
         return (currentSize == 0);
     }

     /*
      * create a method name as dequeue.
      * Remove item from the beginning of the list.
      */
     public int dequeue() 
     {
         int data = front.data;
         front = front.next;
         if (isEmpty()) {
             rear = null;
         }
         currentSize--;
         System.out.println(data + " removed from the queue");
         return data;
     }

     //create enqueue method and pass the parameter
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
