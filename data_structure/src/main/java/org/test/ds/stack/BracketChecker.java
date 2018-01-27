package org.test.ds.stack;

import java.io.IOException;
import java.util.Stack;

public class BracketChecker {
	
		  private String input;

		  public BracketChecker(String in) {
		    input = in;
		  }

		  public boolean check() throws Exception {
		    int stackSize = input.length(); 
		    StackUsingArray theStack = new StackUsingArray(10); 

		    for (int j = 0; j < input.length(); j++)
		    {
		      char ch = input.charAt(j);
		      switch (ch) {
		      case '{': // opening symbols
		      case '[':
		      case '(':
		        theStack.push(ch); // push them
		        break;

		      case '}': // closing symbols
		      case ']':
		      case ')':
		        if (!theStack.isEmpty()) // if stack not empty,
		        {
		          char chx = (char) theStack.pop(); // pop and check
		          if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[')
		              || (ch == ')' && chx != '('))
		        	 return true;
		           // System.out.println("Error: " + ch + " at " + j);
		        } else
		          // prematurely empty
		         // System.out.println("Error: " + ch + " at " + j);
		        	return false;
		        break;
		      default: // no action on other characters
		        break;
		      }
		    }
		    if (!theStack.isEmpty())
		      System.out.println("Error: missing right delimiter");
			return false;
		  }

		  public static void main(String[] args) throws Exception {
		    String input = "{Java [Source]] }";
		    		//(and) {[(Support)]}}";
		    BracketChecker theChecker = new BracketChecker(input);
		    System.out.println(theChecker.check()); 
		  }

		}

