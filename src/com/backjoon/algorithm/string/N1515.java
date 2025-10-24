package com.backjoon.algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class N1515 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numStr = br.readLine();

		int idx = 0;   // numStr 내에서 현재 비교 위치
		int res = 0;   // 현재까지 확인한 수 (결과)

		for (int i = 1; idx < numStr.length(); i++) {
			String s = String.valueOf(i);
			for (int j = 0; j < s.length() && idx < numStr.length(); j++) {
				if (s.charAt(j) == numStr.charAt(idx)) {
					idx++; // 일치하면 다음 글자로 이동
				}
			}
			res = i; // 마지막으로 사용된 수
		}

		System.out.println(res);
	}
}
