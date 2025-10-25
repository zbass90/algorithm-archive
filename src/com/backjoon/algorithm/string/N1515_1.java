package com.backjoon.algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1515_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputNum = br.readLine();

		int idx = 0;
		int count = 1;

		while (true) {
			String countStr = String.valueOf(count);
			for(int i = 0; i < countStr.length(); i++) {
				if(countStr.charAt(i) == inputNum.charAt(idx)) {
					idx++;
					if(inputNum.length() == idx) {
						System.out.println(count);
						return;
					}
				}
			}
			count++;
		}
	}
}
