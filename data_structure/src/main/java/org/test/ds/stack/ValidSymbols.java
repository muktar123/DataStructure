package org.test.ds.stack;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ValidSymbols {
	public static String isValidSymbols(String s) {
		Stack<Character> st = new Stack<Character>();
		if (s == null || s.length() == 0)
			return "YES";
		
		for (int i = 0; i < s.length(); i++) {
			char ch= s.charAt(i);
			if (ch == '[' || ch == '(' || ch == '{') {
				st.push(ch);
			}else if((ch == ']' || ch == ')' || ch == '}') && (!st.isEmpty())){
				if((st.peek()=='(' && ch==')')
						|| (st.peek()=='[' && ch==']') 
						|| (st.peek()=='{' && ch=='}')){
					st.pop();
				} else {
					return "NO";
				}
			} else {
				if ((ch == ']' || ch == '}' || ch == ')')) {
					return "NO";
				}
			}
						
			}
		if (st.isEmpty())
			return "YES";
		else
			return "NO";
				
			}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String s = in.next();
			System.out.print(isValidSymbols(s));
		}
	}
}
