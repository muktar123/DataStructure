package org.test.ds.arrayTest;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EncryptString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		
	//	encryptMyString(inputStr);
		//encryptMyString1(inputStr);
		//foo();
		System.out.println(getSmallestAndLargest(inputStr,2));
	}
	public static void foo(){
		  StringBuilder sb = new StringBuilder();
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();	       
	        
	        System.out.print(A.length()+B.length());
	        System.out.println();
	        System.out.println(A.compareTo(B));
	        
	         String output= A.substring(0,1).toUpperCase()+A.substring(1);
	         String output1= B.substring(0,1).toUpperCase()+B.substring(1);
	        System.out.println(output+""+output1);
	}
	public static String getSmallestAndLargest(String s, int k) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Class.forName("Test.java").newInstance();
		StringBuilder sb = new StringBuilder();
		 Set<String> sets=new TreeSet<String>();
        String smallest = "";
        String largest = "";
        for(int i=0;i<=s.length()-k;i++){
            sets.add(s.substring(i,i+k));            
        }
        String[] all =  sets.toArray(new String[sets.size()]);
        	  smallest =all[0];
        	  largest =all[all.length-1];
        	
        
       
        return smallest+"\n"+largest;
	}
	private static void encryptMyString1(String inputStr) {
		char chArr[] = inputStr.toCharArray();
		for(int  i=0;i<chArr.length;i++){		
			char ch = chArr[i];
		//	if(ch >=65 && ch <=90 || ch>=97 && ch<=122){
			if(Character.isLetter(ch)){
				ch++;
			}
		chArr[i] =ch;
	} 
		System.out.println(String.valueOf(chArr));
	}

	private static void encryptMyString(String inputStr) {
		StringBuilder sb = new StringBuilder();
		for(int  i=0;i<inputStr.length();i++){		
			char ch = inputStr.charAt(i);
			if(ch >=65 && ch <=90 || ch>=97 && ch<=122){
				ch++;
			}
		sb.append(ch);
	} 
		System.out.println(sb.toString());
		
	}

}
