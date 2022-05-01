package com.gl.BalanceBracket;

public class BalancedBracket {

	public boolean CheckBracketBalanced(String brackets) {

		Stack<Character> stack=new Stack<Character>(brackets.length());

		for (int i = 0; i < brackets.length(); i++) {
			char x = brackets.charAt(i);

			if (x == '(' || x == '[' || x == '{') {

				stack.push(x);
				continue;
			}

			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

		return (stack.isEmpty());
	}

}
