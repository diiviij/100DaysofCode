// Java Program Demonstrate remove()
// method of Queue

import java.util.*;

public class arraydeque{
	public static void main(String[] args)
		throws IllegalStateException
	{

		// create object of Queue
		Queue<Integer> Q
			= new ArrayDeque<Integer>();

		// Add numbers to end of Queue
		Q.add(7855642);
		Q.add(35658786);
		Q.add(5278367);
		Q.add(74381793);

		// print queue
		System.out.println("Queue: " + Q);

		// print head and deletes the head
		System.out.println("Queue's head: " + Q.remove());

		// print head and deleted the head
		System.out.println("Queue's head: " + Q.remove());
	}
}
