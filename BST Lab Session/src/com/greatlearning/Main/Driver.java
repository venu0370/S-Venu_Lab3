package com.greatlearning.Main;

import com.greatlearning.BalancedBrackets.BracketsBalancing;

public class Driver {

	public static void main(String[] args) {
		
		BracketsBalancing bracketBalancing = new BracketsBalancing();
		
		String bracketExpression = "([[{}]])";
		
		boolean result;
		result = bracketBalancing.checkingBracketBalanced(bracketExpression);
	
		if (result)
			System.out.println("The Entered String has Balanced Brackets");
		else
			System.out.println("The Entered Strings do not Contain Balanced Brackets");
	}
}
