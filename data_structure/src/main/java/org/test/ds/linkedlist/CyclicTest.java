package org.test.ds.linkedlist;

public class CyclicTest {
	
	public void cyclictest(ListNode head) {
		boolean flag=false;
		ListNode frstPtr =head;
		ListNode slowPtr =head;
		
		while(frstPtr!=null && frstPtr.next!=null) {
			frstPtr=frstPtr.next.next;
			slowPtr=slowPtr.next;
					
			if(frstPtr.data==slowPtr.data) {
				flag=true;
				cyecleLength(frstPtr,slowPtr,flag);
				removeCycle(frstPtr,slowPtr);
			}
		}
		
	}

	private void removeCycle(ListNode frstPtr, ListNode slowPtr) {
		slowPtr=slowPtr.next;
		while(slowPtr!=frstPtr) {
			slowPtr=slowPtr.next;
		}
		slowPtr.next=null;
		System.out.println(frstPtr);
		
	}

	private void cyecleLength(ListNode frstPtr, ListNode slowPtr, boolean flag) {
		slowPtr=slowPtr.next;
		int length=0;
		if(flag) {
			while(slowPtr!=frstPtr) {
				length++;
				slowPtr=slowPtr.next;
		}
		
	}
		System.out.println("cycle length :"+length);

}
}