package org.test.ds.stack;

import java.util.NoSuchElementException;
import java.util.Stack;

public class QImplementation {

	private int qArray[];
	private int front;
	private int rear;
	int size;
	private  Stack stk; 

	public QImplementation(int arr[], int n) {
		this.front = -1;
		this.rear = -1;
		this.qArray = new int[n];
		this.size = 0;
		stk = new Stack();
	}

	public void add(int x) {
		/*
		 * if(rear==-1){ front=0; rear=0; qArray[0]=x; size++; }
		 */
		if (size >= qArray.length) {
			System.out.println("Queue overflow");
		} else {
			size++;
			qArray[++rear] = x;

		}
	}

	public int remove() {
		int m = 0;
		if (size <= 0) {
			System.out.println("queue under flow");
			throw new NoSuchElementException("Underflow Exception");
		} else {
			// size--;
			 m = qArray[++front];
			/*
			 * if ( front == rear) { front = -1; rear = -1; }
			 */
			// front++;

			size--;
		}
		return m;

	}

	public int peek() {
		int n = qArray[rear];
		return n;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	/* Function to check if queue is full */
	public boolean isFull() {
		return front == 0 && rear == size - 1;
	}
	public void display(){
		for (int i = front+1; i <= rear; i++){
            System.out.print(qArray[i]+" ");
			//System.out.println("");
			stk.push(qArray[i]);
		}
		
		System.out.println();
		while(!stk.isEmpty()){
			
			System.out.print(stk.pop()+ " ");
			
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[10];
		QImplementation qi = new QImplementation(arr, 2);
		qi.add(55);
		qi.add(6);
		qi.display();

	//	System.out.println(qi.remove());
	//	System.out.println(qi.remove());
	//	System.out.println(qi.size);
	//	System.out.println(qi.remove());
	}

}
