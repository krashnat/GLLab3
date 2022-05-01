package com.gl.findpairs;

import java.util.HashSet;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {

		FindPairsInBinaryTree find = new FindPairsInBinaryTree();
		int[] values = { 40, 20, 60, 10, 30, 50, 70 };

		Node root = null;
		for (int key : values) {
			root = NodeOperations.insert(root, key);
		}

		int sum = 130;

		Set<Integer> set = new HashSet<>();

		if (!find.findPair(root, sum, set)) {
			System.out.println("nodes are not found");
		}

	}

}
