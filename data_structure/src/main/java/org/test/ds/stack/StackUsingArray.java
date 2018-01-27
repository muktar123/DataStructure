package org.test.ds.stack;


public class StackUsingArray {
	int[] stackArray;
	int top =-1;
	int capacity=10;
	
	StackUsingArray(int capacity){
		stackArray = new int[capacity];
	}
	
	public int size(){
		 return top+1;
	}
	public boolean isEmpty(){
		return top<0;
	}
	public void push(int item) throws Exception{
		if(capacity==size()){
			throw new Exception("Stack is full");
		}else{
			stackArray[++top]=item;
		}
	}
	public int pop() throws Exception{
		if(isEmpty()) throw new Exception("Stack is empty");
		//stackArray[top]=0;
		return  stackArray[top--];
	//	return item;
	}
	public int peek() throws Exception{
		if(isEmpty()) throw new Exception("Stack is empty");
		//int item= stackArray[top];
		return  stackArray[top];
	//	return item;
	}
	public void display(){
		System.out.println("displaying");
		for(int i=0;i<size();i++){
			System.out.println(stackArray[i]);
			
		}
	}
	public static void main(String[] args) throws Exception {
		StackUsingArray sua = new StackUsingArray(10);
		sua.push(10);
		sua.push(20);
		//sua.display();
/*		while(!sua.isEmpty()){
			int val= sua.peek();
			System.out.println(val);
		}*/
		sua.display();
		sua.pop();
		sua.display();
	//	System.out.println(sua));
	
		
		
	}

}

