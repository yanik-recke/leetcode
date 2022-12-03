package problemRansomNote;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
    	if (ransomNote.length() > magazine.length()) return false;
    	
        StringBuilder tempMagazine = new StringBuilder(magazine);
        boolean possible = true;
        int idx = -1;
        
        for (int i = 0; i < ransomNote.length() && possible; i++) {
        	if (tempMagazine.toString().contains("" + ransomNote.charAt(i))) {
        		idx = tempMagazine.indexOf("" + ransomNote.charAt(i));
        		tempMagazine.replace(idx, idx + 1, "0");
        	} else {
        		possible = false;
        	}
        }
        
    	return possible;
    }
}
