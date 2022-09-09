package com.bridzelab.StacksAndQueues;

public class DqueueMain 
{

	public static void main(String[] args) 
	{
		DQueue queue = new DQueue();

        queue.enqueue(56);
        queue.dequeue();
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(70);
        queue.dequeue();
        System.out.println("queue is empty");
    }
}
