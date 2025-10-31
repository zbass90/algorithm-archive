package com.backjoon.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*

Bronze Ⅱ

[Input]
8 3
0 0 0 0 0 0 0 0
1 2 1
1 4 1
2 2 4

[Output]
0 0 1 0 0 0 0 0

*/

public class N21918 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());
		int commandCnt = Integer.parseInt(st.nextToken());

		boolean[] lights = new boolean[cnt + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= cnt; i++) {
			lights[i] = ofOnOff(st.nextToken());
		}

		for (int i = 0; i < commandCnt; i++) {
			st = new StringTokenizer(br.readLine());
			String selectCommand = st.nextToken();
			int b = Integer.parseInt(st.nextToken());
			String c = st.nextToken();

			switch (selectCommand) {
				case "1" -> lights[b] = ofOnOff(c);
				case "2" -> {
					int r = Integer.parseInt(c);
					for (int idx = b; idx <= r; idx++) lights[idx] = !lights[idx];
				}
				case "3" -> {
					int r = Integer.parseInt(c);
					for (int idx = b; idx <= r; idx++) lights[idx] = false;
				}
				case "4" -> {
					int r = Integer.parseInt(c);
					for (int idx = b; idx <= r; idx++) lights[idx] = true;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= cnt; i++) {
			sb.append(ofOnOffNumber(lights[i])).append(' ');
		}
		System.out.print(sb);
	}

	public static boolean ofOnOff(String s) {
		return s.equals("1");
	}

	public static int ofOnOffNumber(boolean b) {
		return b ? 1 : 0;
	}
}
