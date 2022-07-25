package com.greatlearning.BalancedBrackets;

import java.util.Stack;

public class BracketsBalancing {
	
	public Boolean checkingBracketBalanced (String bracketExpression) {
		
		Stack<Character> stack = new Stack<Character>();

		for (int i =0;i < bracketExpression.length();i++)
		{
			char charcter = bracketExpression.charAt(i);
		
			if (charcter == '(' || charcter == '[' || charcter == '{')
			{
				stack.push(charcter);
				continue;
			}
			
			if (stack.isEmpty())
				
				return false;
			
			char c;
			
			switch(charcter) {
			
			case '}':
			
			c = stack.pop();
			if (c =='(' || c == '[')
				return false;
			
			break;
			
			case'(':
			
			c = stack.pop();
			if ( c == '(' || c == '{')	
				
				return false;
	
			break;
			
			case ')':
				
				c = stack.pop();
				if ( c =='{'|| c == '[');
				
				return false;	
			}	
		}
	return(stack.isEmpty());	
	}
}
