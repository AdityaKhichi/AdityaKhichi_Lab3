package com.gl.BST.Model;

import java.util.HashSet;

public class FindSumPair {
		
	public static Node newNode(int nodeData) {		
		
		Node temp = new Node();
		temp.nodeData=nodeData;
		temp.leftNode=null;
		temp.rightNode=null;
		return temp;
		
	}
	
	public Node insert(Node root,int key) {
		
		if(root==null) {
			return newNode(key);			
		}
		if(key<root.nodeData) {
			root.leftNode=insert(root.leftNode,key);
			
		}else {
			root.rightNode=insert(root.rightNode,key);
		}
		return root;
		
	}
	
	public void findPairWithGivenSum(Node root,int sum) {
		
		HashSet<Integer> set=new HashSet<>();
		if (!findPairUtil(root,sum,set)) {
			System.out.println("Nodes are not found");			
		}
		
	}

	private boolean findPairUtil(Node root, int sum, HashSet<Integer> set) {
		
		if(root==null) {
			return false;
		}
		
		if(findPairUtil(root.leftNode,sum,set)) {
			return true;			
		}
		
		if(set.contains(sum-root.nodeData)) {
			System.out.println("Pair is (" + (sum-root.nodeData) + "," + root.nodeData + ")");
			return true;
		}
		else {
			set.add(root.nodeData);
		}
		
		return findPairUtil(root.rightNode,sum,set);
		
	}

}
