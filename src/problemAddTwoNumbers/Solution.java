package problemAddTwoNumbers;

import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		
	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	BigInteger number1 = new BigInteger(reverseOrder(l1));
    	BigInteger number2 = new BigInteger(reverseOrder(l2));
    	
    	BigInteger number3 = number1.add(number2);
    	
    	String numAsString = number3.toString();
    	
    	ListNode node = new ListNode();
    	ListNode runner = new ListNode();
    	
    	node.val = numAsString.charAt(numAsString.length() - 1) - '0';
    	runner = node;
    	
    	for (int i = numAsString.length() - 2; i >= 0; i--) {
    		runner.next = new ListNode(numAsString.charAt(i) - '0', null);
    		runner = runner.next;
    	}
    	
    	return node;
    }
    
    
    private static String reverseOrder(ListNode node) {
    	if (node.next == null) {
    		return Long.toString(node.val);
    	} else {
    		return reverseOrder(node.next).concat(Long.toString(node.val));
    	}
    	
    }
    
	
}
