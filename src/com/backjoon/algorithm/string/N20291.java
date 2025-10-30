package com.backjoon.algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/*

SILVER Ⅲ

[input]
8
sbrus.txt
spc.spc
acm.icpc
korea.icpc
sample.txt
hello.world
sogang.spc
example.txt

[output]
icpc 2
spc 2
txt 3
world 1

 */

public class N20291 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(br.readLine());
		Map<String, Integer> extMap = new TreeMap<>();
		for (int i = 0; i < cnt; i++) {
			String file = br.readLine().trim();
			int dot = file.indexOf('.');
			String ext = file.substring(dot + 1);
			extMap.merge(ext, 1, Integer::sum);
		}

		StringBuilder out = new StringBuilder();
		for (Map.Entry<String, Integer> entry : extMap.entrySet()) {
			out.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
		}

		System.out.print(out);
	}
}
