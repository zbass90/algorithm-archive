package com.backjoon.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*

Bronze Ⅰ

[Input]
8
3 1
3 0
6 0
2 1
4 1
3 0
4 0
3 1

[Output]
3

*/

public class N14467 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int observerCount = Integer.parseInt(br.readLine());
		// 소의 번호 1 - 10
		// 소의 위치는 길의 왼쪽 0, 오른쪽 1
		// 소의 번호, 위치
		Map<Integer, Boolean> observer = new HashMap<>();
		int result = 0;
		for (int i = 0; i < observerCount; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			boolean location = st.nextToken().equals("1");
			Boolean beforeLocation = observer.getOrDefault(num, location);
			if (location != beforeLocation) result++;
			observer.put(num, location);
		}

		System.out.println(result);
	}
}
