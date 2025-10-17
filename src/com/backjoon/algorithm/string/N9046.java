package com.backjoon.algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/*

Bronze Ⅱ

[Input]
3
asvdge ef ofmdofn
xvssc kxvbv
hull full suua pmlu

[Output]
f
v
?

*/
public class N9046 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCaseNum = Integer.parseInt(br.readLine());
		if (testCaseNum < 1 || testCaseNum > 255) return;

		for (int i = 0; i < testCaseNum; i++) {
			int[] alphabetSet = new int[26];
			char[] charArray = br.readLine().replaceAll(" ", "").toCharArray();

			// 알파벳 빈도수 계산
			for (char c : charArray) {
				alphabetSet[c - 'a']++;
			}

			// 최댓값 탐색
			int max = Arrays.stream(alphabetSet).max().getAsInt();

			// 최댓값 개수와 인덱스 확인
			int count = 0;
			int maxIndex = -1;
			for (int j = 0; j < alphabetSet.length; j++) {
				if (alphabetSet[j] == max) {
					maxIndex = j;
					count++;
				}
			}

			// 출력
			if (count > 1) {
				System.out.println("?");
			} else {
				System.out.println((char) (maxIndex + 'a'));
			}
		}
	}
}
