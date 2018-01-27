package org.test.ds.stack;

import java.util.Stack;

public class PostfixExpressionEvaluation {

	public int evaluateExpression(String tokens,Stack<Integer> s){
	Stack<Integer> stack= new Stack<Integer>();
	stack=s;
	char[] c = tokens.toCharArray();
	for(char token: c){
		if(tokens.equals("+")){
			int op1= stack.pop();
			int op2= stack.pop();
			int res =op1+op2;
			stack.push(res);
		}
		else if(tokens.equals("-")){
			int op1= stack.pop();
			int op2= stack.pop();
			int res =op2-op1;
			stack.push(res);
		}
		else if(tokens.equals("*")){
			int op1= stack.pop();
			int op2= stack.pop();
			int res =op1*op2;
			stack.push(res);
		}
		else if(tokens.equals("/")){
			int op1= stack.pop();
			int op2= stack.pop();
			int res =op2/op1;
			stack.push(res);
		}else{
			stack.push(Character.getNumericValue(token));
		}
		
	}
	return stack.pop();
	}
	public static void main(String[] args) {
		String tokens ="*+-";
		Stack<Integer> s= new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(5);
		PostfixExpressionEvaluation p = new PostfixExpressionEvaluation();
		System.out.println(p.evaluateExpression(tokens,s));
		
	}
}
