package org.test.ds.HackerRank;
import java.io.*;
import java.util.*;

public class RectangleHist {


	    public int rectangleHistogram(int[] recArray){
	        int area=0;
	        int maxArea=0;
	        Stack<Integer> stck = new Stack();
	        int i=0;
	        for(i=0;i<recArray.length;){
	            if(stck.isEmpty() || recArray[stck.peek()]<=recArray[i]){
	                stck.add(i++);
	            }else{
	                int top = stck.pop();
	                if(stck.isEmpty()){
	                    area =i*recArray[top];
	                }else{
	                    area =recArray[top]*(i-stck.peek()-1);
	                }
	                if(area>maxArea) maxArea =area;
	            }
	             
	        }
	        while(!stck.isEmpty()){
	             int top = stck.pop();
	                if(stck.isEmpty()){
	                    area =i*recArray[top];
	                }else{
	                    area =recArray[top]*(i-stck.peek()-1);
	                }
	                if(area>maxArea) maxArea =area;
	            
	        }
	       return maxArea;
	    }
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	    	RectangleHist sl = new RectangleHist();
	    	System.out.println("Please enter size of array");
	    	Scanner sc = new Scanner(System.in);
	    	int x = sc.nextInt();
	    	int arr[] = new int[x];
	    	System.out.println("Please enter "+ x+ " number");
	    	 for (int i = 0; i < x; i++)
	    	    {
	    	        
	    	        arr[i] = sc.nextInt();
	    	    }
	            System.out.print(sl.rectangleHistogram(arr));
	    }
	
}
