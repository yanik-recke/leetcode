package problemMiddleOfTheLinkedList;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    public ListNode middleNode(ListNode head) {
    	List<ListNode> list = new ArrayList<>();
    	
    	int i = 0;
    	
    	while (head != null) {
    		i++;
    		list.add(head);
    		head = head.next;
    	}
    	
    	return list.get(i / 2);
    }
    
}
