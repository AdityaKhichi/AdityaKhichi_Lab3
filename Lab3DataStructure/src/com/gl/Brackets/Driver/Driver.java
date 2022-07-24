package com.gl.Brackets.Driver;

import com.gl.Brackets.Model.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
		
		String bracketExpression = "([[{}]])";
		boolean isBalanced=BalancingBrackets.checkBalancingBrackets(bracketExpression);
		
		if(isBalanced) {
			System.out.println("Balanced Brackets");	
		}
		else {
			System.out.println("Unbalanced Brackets");
		}

	}

}
