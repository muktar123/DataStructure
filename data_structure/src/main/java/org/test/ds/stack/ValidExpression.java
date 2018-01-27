package org.test.ds.stack;

import java.util.Stack;

public class ValidExpression {

	public static boolean isValidExpression(String s) {
		Stack<Character> stk = new Stack<>();
		if (s == null || s.length() == 0)
			return true;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				if (!stk.isEmpty() && stk.peek() == '(') {
					stk.pop();
				} else {
					return false;
				}
			} else if (s.charAt(i) == '}') {
				if (!stk.isEmpty() && stk.peek() == '{') {
					stk.pop();
				} else {
					return false;
				}
			} else if (s.charAt(i) == ']') {
				if (!stk.isEmpty() && stk.peek() == '[') {
					stk.pop();
				} else {
					return false;
				}

			} else {
				stk.push(s.charAt(i));
			}
		}
		if (stk.isEmpty())
			return true;
		else
			return false;
	}

	public static boolean isValidExpressionUsingSwitch(String s) {
		if (s == null || s.length() == 0)
			return true;
		Stack<Character> stk = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			switch (ch) {

			case '(':
			case '{':
			case '[':
				stk.push(ch);
				break;
			case ')':
			case '}':
			case ']':
				if (!stk.isEmpty()) {
					char stkCh = stk.pop();
					if ((ch == ')' && stkCh == '(') || (ch == '}' && stkCh == '{') || (ch == ']' && stkCh == '['))
						return true;
				} else
					return false;
				break;

			default:
				break;
			}
		}
	
			return false;

	}

	public static void main(String[] args) {
		String s = "({[]})";
//		System.out.println(isValidExpression(s));
		System.out.println(isValidExpressionUsingSwitch(s));

	}
}
