package com.gl.findpairs;

public class NodeOperations {
	
	public static Node insert(Node root, int key)
    {
       
        if (root == null) {
            return new Node(key);
        }
 
        if (key < root.data) {
            root.left = insert(root.left, key);
        }
 
        
        else {
            root.right = insert(root.right, key);
        }
 
        return root;
    }

}
