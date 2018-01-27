package org.test.ds.linkedlist;

import java.util.Stack;


public class PalindromeList {

public static boolean isPalindrome2(LinkedListNode head){
	
	LinkedListNode fastPtr=head, slowPtr =head,oldHead=null, newHead=null;
	while(fastPtr!=null && fastPtr.next!=null) {
		fastPtr =fastPtr.next.next;
		slowPtr =slowPtr.next;		
	}
	if(fastPtr.next!=null) {
		slowPtr =slowPtr.next;
		
	}
	oldHead=head;
	
	newHead=slowPtr.next;
	slowPtr.next=null;
	reverse(slowPtr);
	return compare(oldHead,newHead);
	
		
		
		
	}
static void reverse(LinkedListNode slowPtr) 
{
	LinkedListNode prev = null;
    LinkedListNode current = slowPtr;
    LinkedListNode next;
    while (current != null) 
    {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    slowPtr = prev;
}

	private static boolean compare(LinkedListNode oldHead, LinkedListNode newHead) {
		LinkedListNode temp1 = oldHead;
        LinkedListNode temp2 = newHead;
 
        while (temp1 != null && temp2 != null) 
        {
            if (temp1.data == temp2.data) 
            {
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else
                return false;
        }
 
        /* Both are empty reurn 1*/
        if (temp1 == null && temp2 == null)
            return true;
 
        /* Will reach here when one is NULL
           and other is not */
        return false;
    }

	public static boolean isPalindrome1(LinkedListNode head){
		
		LinkedListNode root = head;		
		String aa="";
		while(root!=null){
			aa+=root.data;
			root=root.next;
		}
		StringBuilder sb = new StringBuilder();
		char[] aaa =aa.toCharArray();
		int cnt=0;
		//for(int i=aa.length()-1;i>=0;i--){
		//	sb.append(aaa[i]);
		for(int i=0;i<aa.length();i++){
			if(aaa[i]==aaa[aaa.length-i-1])
				cnt++;
		}
		if(cnt==aa.length()) return true;
		return false;//aa.equals(sb.toString());
		
	}
	public static boolean isPalindrome(LinkedListNode head) {
		LinkedListNode fast = head;
		LinkedListNode slow = head;

		Stack<Integer> stack = new Stack<Integer>();

		/*
		 * Push elements from first half of linked list onto stack. When fast
		 * runner (which is moving at 2x speed) reaches the end of the linked
		 * list, then we know we're at the middle
		 */
		while (fast != null && fast.next != null) {
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
			System.out.println(fast.data);
		}

		/* Has odd number of elements, so skip the middle element */
		if (fast != null) {
			slow = slow.next;
		}

		while (slow != null) {
			int top = stack.pop().intValue();

			/* If values are different, then it's not a palindrome */
			if (top != slow.data) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
	private LinkedListNode a;
	public static void main(String[] args) {
		PalindromeList list = new PalindromeList();
		list.a = new LinkedListNode(1);
	    list.a.next = new LinkedListNode(2);
	    list.a.next.next = new LinkedListNode(3);
	    list.a.next.next.next = new LinkedListNode(2);
	    list.a.next.next.next.next = new LinkedListNode(1);
		System.out.println(isPalindrome(list.a));
		System.out.println(isPalindrome1(list.a));
		System.out.println(isPalindrome2(list.a));
	}
}
