package com.backjoon.algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

Bronze Ⅳ

[input]
5
54321

[output]
15

 */
public class N11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int repeat = Integer.parseInt(br.readLine());
		String numString = br.readLine();

		int result = 0;

		for(int i = 0; i < numString.length(); i++) {
			result += numString.charAt(i) - '0'; // 0 -> Unicode 48
		}

		System.out.print(result);
	}
}
