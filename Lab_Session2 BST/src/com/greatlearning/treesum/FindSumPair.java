package com.greatlearning.treesum;

import java.util.*;

public class FindSumPair {
	
	public Node insert(Node root,int key) {
		
		if (root == null)
			
			return new Node(key);
		
		if(key < root.nodeData)
			
			root.leftNode = insert(root.leftNode,key);
		else
			
			root.rightNode = insert(root.rightNode,key);
		
		return root;	
	}
	
	public boolean findpairUtil(Node root,int sum,HashSet<Integer>set)
	{
		if (root == null)
			return false;
		if (findpairUtil(root.leftnode,sum,set))
			return true;
		
		if (set.contains(sum-root.nodeData)) {
			System.out.println("PAIR is Found ("+(sum-root.nodeData)+","+root.nodeData +")");
		 return true;
		}
		else
			set.add(root.nodeData);
		return false;
	}
	public void findPairWithGivenSum(Node root , int sum)
	{
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		if (!findpairUtil(root,sum,set1))
			System.out.println("Nodes Are Not Found");
	}
}
