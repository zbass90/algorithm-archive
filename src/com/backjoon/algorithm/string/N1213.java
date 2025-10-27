package com.backjoon.algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1213 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		if (word.length() > 50) return;

		String result = "I'm Sorry Hansoo";
		// 0 - 25
		int[] countArr = new int[26];

		for (char c : word.toCharArray()) {
			countArr[c - 'A']++;
		}

		int oddNumCnt = 0; // 홀수 카운트
		int oddIdx = 0; // 홀수 위치 idx

		for (int i = 0; i < countArr.length; i++) {
			if (countArr[i] % 2 == 1) {
				oddIdx = i;
				oddNumCnt++;
			}
			if (oddNumCnt > 1) {
				System.out.println(result);
				return;
			}
		}

		String[] strArr = new String[word.length()];
		int strArrIdx = 0;

		for (int i = 0; i < countArr.length; i++) {
			if (countArr[i] > 1) {
				for (int j = 0; j < countArr[i] / 2; j++) { // 알파벳 카운트 갯수
					strArr[strArrIdx] = String.valueOf((char) (i + 'A'));
					strArr[strArr.length - strArrIdx -1] = String.valueOf((char) (i + 'A'));
					strArrIdx++;
				}
			}
		}

		if (oddNumCnt == 1) strArr[strArr.length / 2] = String.valueOf((char) (oddIdx + 'A'));

		for (String string : strArr) {
			System.out.print(string);
		}
	}
}
