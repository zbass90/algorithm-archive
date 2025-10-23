package com.backjoon.algorithm.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/*

SILVER Ⅲ

[input]
7 4
apple
ant
sand
apple
append
sand
sand
-------------------------
12 5
appearance
append
attendance
swim
swift
swift
swift
mouse
wallet
mouse
ice
age

[output]
sand
apple
append
-------------------------
swift
mouse
appearance
attendance
append
wallet

 */
public class N20920 {
	// 자주 나오는 단어일수록 앞에 배치한다.
	// 해당 단어의 길이가 길수록 앞에 배치한다.
	// 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int readLimit = Integer.parseInt(st.nextToken());

		Map<String, Integer> wordFreqMap = new HashMap<>();

		for(int i = 0; i < size; i++) {
			String word = br.readLine();
			if(word.length() < readLimit) continue;
			wordFreqMap.merge(word, 1, Integer::sum);
		}

		List<String> words = new ArrayList<>(wordFreqMap.keySet());

		words.sort((a, b) -> {
			int aVal = wordFreqMap.get(a);
			int bVal = wordFreqMap.get(b);

			if (aVal != bVal) return Integer.compare(bVal, aVal);
			if (a.length() != b.length()) return Integer.compare(b.length(), a.length());
			return a.compareTo(b);
		});

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (String word : words) {
			bw.write(word);
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
