package com.backjoon.algorithm.string;

import java.util.Scanner;

/*

Bronze Ⅰ

[Input]
Mississipi
zZa
baaa

[Output]
?
Z
A

바뀐 코드 내용 :  maxCount, currentCount 값이 동일할 때는 '?' 달아주기,
							둘 다 시간복잡도는 O(n)이자만, 다소 불필요한 코드가 될 수 있어 before()로 구분했다.
*/
public class N1157 {
	public static void main(String[] args) {
		// 알파벳 대소문자로
		// A -> 65
		// Z -> 90
		// 0 - 25 (총 26개)

		Scanner sc = new Scanner(System.in);
		char[] chars = sc.nextLine().trim().toUpperCase().toCharArray();
		if(chars.length > 1_000_000) return;

		// 알파벳 체크 배열
		int[] alphabetCountArray = new int[26];
		int maxCount = 0;
		char result = '?';

		for(int i  = 0; i < chars.length; i++) {
			alphabetCountArray[chars[i] - 'A']++;

			int currentIdx = chars[i] - 'A';
			int currentCount = alphabetCountArray[currentIdx];

			if(maxCount < currentCount) {
				maxCount = currentCount;
				result = (char) ('A' + currentIdx);
			} else if(maxCount == currentCount) {
				result = '?';
			}
		}
		System.out.println(result);
	}

	void before() {
		Scanner sc = new Scanner(System.in);
		char[] chars = sc.nextLine().trim().toUpperCase().toCharArray();
		if(chars.length > 1_000_000) return;

		// 알파벳 체크 배열
		int[] alphabetCountArray = new int[26];
		int maxCount = 0;
		int maxIdx = 0;

		for(int i  = 0; i < chars.length; i++) {
			alphabetCountArray[chars[i] - 'A']++;

			int currentIdx = chars[i] - 'A';
			int currentCount = alphabetCountArray[currentIdx];

			if(maxCount < currentCount) {
				maxCount = currentCount;
				maxIdx = currentIdx;
			}
		}

		int chkCount = 0;
		boolean duplicate = false;

		for(int idx : alphabetCountArray) {
			if(idx == maxCount) {
				chkCount++;
			}
			if(chkCount > 1) duplicate = true;
		}

		if (duplicate) {
			System.out.print("?");
		} else {
			System.out.print((char) (maxIdx + 'A'));
		}
	}
}
