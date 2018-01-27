package org.test.ds.stack;

import java.util.Stack;

public class RectangleHistogram {	
	public int getMaxArea(int[] input){
		int area=0,maxArea=0;
		int i=0;
		Stack<Integer> stck = new Stack<Integer>();
		for(i=0;i<input.length;){
			if(stck.isEmpty() || input[stck.peek()]<=input[i]){
				stck.add(i++);
			}else{
				int top= stck.pop();
				if(stck.isEmpty()){					
					area= input[top]*i;
				}else{
					area= input[top]*(i-stck.peek()-1);
				}
				if(area>maxArea)
					maxArea=area;				
			}
		}
		while(!stck.isEmpty()){
			int top= stck.pop();
			if(stck.isEmpty()){				
				area= input[top]*i;
			}else{
				area= input[top]*(i-stck.peek()-1);
			}
			if(area>maxArea)
				maxArea=area;
		}
		return maxArea;
	}
	public static void main(String[] args) {
		RectangleHistogram rh = new RectangleHistogram();
		int[] input ={1,2,3,4,5};
		int maxArea = rh.getMaxArea(input);
		System.out.println(maxArea);
	}
	

}
