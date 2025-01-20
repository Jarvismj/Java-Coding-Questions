package srctest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BalancedBracket {

	public static void main(String[] args) {

		String str = "([{]})";

		if (isBalanced(str)) {
			System.out.println("Given String is balanced.");
		} else {
			System.out.println("Given string is not balanced.");
		}

	}

	public static boolean isBalanced(String str) {
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
				st.push(str.charAt(i));
			} else {
				if (!st.empty()
						&& ((st.peek() == '(' && str.charAt(i) == ')') || (st.peek() == '[' && str.charAt(i) == ']')

								|| (st.peek() == '{' && str.charAt(i) == '}'))) {
					st.pop();
				} else {
					return false;
				}
			}
		}
		return st.empty();

	}

}
