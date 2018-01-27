package org.test.ds.stack;

import java.util.EmptyStackException;

public class TwoStackUsingOneArray {
	
	int[] stackArr;
	int size;
	int top1;
	int top2;
	
	public TwoStackUsingOneArray(int size) {
		this.size=size;
		stackArr= new int[size];
		top1=-1;
		top2=size;
	}
	public void push(int stackId, int data) {
		if(top1+1==top2) throw new StackOverflowError("Array Full");
		if(stackId==1) {
			stackArr[++top1]=data;
		}else if(stackId==2){
			stackArr[--top2]=data;
		}else {
			return;
		}
	}
	
	@SuppressWarnings("null")
	public int pop(int stackId) {
		if(stackId==1) {
			if(top1==-1) throw new EmptyStackException();
			int topEle= stackArr[top1];
			stackArr[top1--]=(Integer) null;
			return topEle;
		}else if(stackId==2) {
			if(top1==size) throw new EmptyStackException();
			int topEle= stackArr[top2];
			stackArr[top2++]=(Integer) null;
			return topEle;
		}else {
			return (Integer) null;
		}
		
	}

}
