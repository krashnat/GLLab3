package com.gl.findpairs;

import java.util.Set;



public class FindPairsInBinaryTree {
	
	public static boolean findPair(Node root, int sum, Set<Integer> set)
    {
        
        if (root == null) {
            return false;
        }
 
        if (findPair(root.left, sum, set)) {
            return true;
        }
 
       
        if (set.contains(sum - root.data))
        {
            System.out.println("Pair is (" + (sum - root.data) + ", "
                                    + root.data + ")");
            return true;
        }
 
        
        else {
            set.add(root.data);
        }
 
        
        return findPair(root.right, sum, set);
    }

}
