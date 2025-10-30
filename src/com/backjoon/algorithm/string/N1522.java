package com.backjoon.algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

SILVER Ⅰ

[input]
abababababababa

[output]
3

 */

public class N1522 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().trim();
		int n = s.length();
		if(n > 1_000) return;

		int aCnt = 0;
		for (int i = 0; i < n; i++) if (s.charAt(i) == 'a') aCnt++;

		if (aCnt == 0 || aCnt == n) {
			System.out.println(0);
			return;
		}

		int bCnt = 0;
		for (int i = 0; i < aCnt; i++) if (s.charAt(i) == 'b') bCnt++;

		int answer = bCnt;

		for (int i = 0; i < n - 1; i++) {
			if (s.charAt(i) == 'b') bCnt--;                           // 창에서 빠지는 문자
			if (s.charAt((i + aCnt) % n) == 'b') bCnt++;              // 창으로 들어오는 문자
			answer = Math.min(answer, bCnt);
		}
		System.out.println(answer);
	}
}