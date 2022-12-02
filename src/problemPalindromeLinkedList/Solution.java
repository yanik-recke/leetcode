package problemPalindromeLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Solution {
	
    public boolean isPalindrome_memoryOptimised(ListNode head) {
    	ListNode runner = head.next;
    	StringBuilder number = new StringBuilder();
    	StringBuilder number2 = new StringBuilder();
    	
    	number.append(head.val);
    	number2.insert(0, head.val);
    	
    	while (runner != null) {
    		number.append(runner.val);
    		number2.insert(0, runner.val);
    		runner = runner.next;
    	}
    	
    	return number.toString().equals(number2.toString());
    }
    
    public boolean isPalindrome_timeComplexity(ListNode head) {
    	ListNode runner = head;
    	List<Integer> list = new ArrayList<>();
    	List<Integer> list2 = new ArrayList<>();
    	
    	
    	while (runner != null) {
    		list.add(runner.val);
    		list2.add(0, runner.val);
    		runner = runner.next;
    	}
    	
    	return list.equals(list2);
    }
}
