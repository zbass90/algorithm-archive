package com.backjoon.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10709 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int height = Integer.parseInt(st.nextToken());
		int weight = Integer.parseInt(st.nextToken());

		int[][] result = new int[height][weight];

		for (int i = 0; i < height; i++) {
			String row = br.readLine();
			boolean onOff = false;
			int cnt = 0;
			for (int j = 0; j < weight; j++) {
				switch (row.charAt(j)) {
					case 'c' -> {
						result[i][j] = 0;
						onOff = true;
						cnt = 0;
					}
					case '.' -> {
						if (onOff) {
							result[i][j] = ++cnt;
						} else {
							result[i][j] = -1;
							cnt = 0;
						}
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int[] ints : result) {
			for (int anInt : ints) {
				sb.append(anInt).append(" ");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}
