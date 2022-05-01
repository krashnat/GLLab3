package com.gl.BalanceBracket;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		BalancedBracket bracketCheck=new BalancedBracket();
		String input1="( [ [ { } ] ] )";
		
		if(bracketCheck.CheckBracketBalanced(input1)) {
			System.out.println("The entered String has Balanced Brackets");
			}
		else {
		System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		
	}
}
