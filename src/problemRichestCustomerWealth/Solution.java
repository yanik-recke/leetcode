package problemRichestCustomerWealth;

public class Solution {
	
    public int maximumWealth(int[][] accounts) {
        int currHighestSum = 0;
        int sum = 0;
        
        for (int[] customer : accounts) {
        	for (int money : customer) {
        		sum += money;
        	}
        	
        	if (currHighestSum < sum) {
        		currHighestSum = sum;
        	}
        	
        	sum = 0;
        }
    	
    	return currHighestSum;
    }
	
}
