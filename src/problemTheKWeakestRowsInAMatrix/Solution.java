package problemTheKWeakestRowsInAMatrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Solution {
	
    public int[] kWeakestRows(int[][] mat, int k) {
    	if (k == 0) {
    		return new int[0];
    	}
    	
    	List<Pair<Integer,Integer>> list = new ArrayList<>();
    	
        int[] indexes = new int[k];
        
        
        int soldiers = 0;
        
        for (int i = 0; i < mat.length; i++) {
        	for (int j = 0; j < mat[i].length; j++) {
        		if (mat[i][j] == 1) {
        			soldiers++;
        		}
        	}
        	
        	list.add(new Pair<Integer, Integer>(i, soldiers));
        	soldiers = 0;
        }
    	
        Collections.sort(list, new Comparator<Pair<Integer, Integer>>() {
        	  @Override
        	  public int compare(Pair<Integer, Integer> left, Pair<Integer, Integer> right) {
        	    return left.r() - right.r();
        	  }
        	});
        
        int i = 0;
        Iterator<Pair<Integer, Integer>> it = list.iterator();
        
        while (it.hasNext() && i < k) {
        	indexes[i] = it.next().l();
        	i++;
        }
        
    	return indexes;
    }
    
}


