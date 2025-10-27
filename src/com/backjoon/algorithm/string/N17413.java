package com.backjoon.algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class N17413 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringBuilder result = new StringBuilder();

		boolean wordYN = true;
		Stack<Character> stack = new Stack<>();

		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == '<') {
				while (!stack.empty()) {
					result.append(stack.pop());
				}
				wordYN = false;
				result.append(c);
				continue;
			}
			else if(c == '>') {
				result.append(c);
				wordYN = true;
				continue;
			}

			if(!wordYN) result.append(c);
			else {
				if(c != ' ') stack.add(c);
				else {
					while (!stack.empty()) {
						result.append(stack.pop());
					}
					result.append(" ");
				}
			}
		}

		while (!stack.empty()) result.append(stack.pop());

		System.out.println(result);

	}
}