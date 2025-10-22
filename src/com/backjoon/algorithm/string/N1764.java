package com.backjoon.algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

/*

SILVER Ⅳ

[input]
3 4
ohhenrie
charlie
baesangwook
obama
baesangwook
ohhenrie
clinton

[output]
2
baesangwook
ohhenrie
 */
public class N1764 {
	// 듣도 못한 사람의 수 N
	// 보도 못한 사람의 수 M
	// 이어서 듣잡,,,
	// 이어서 보잡 사람의 순서로 주어짐
	// 이름은 띄어쓰기 없이 알파벳 소문자, 그 길이는 20이하
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Set<String> nSet = new TreeSet<>();
		Set<String> mSet = new TreeSet<>();

		for(int i = 0; i < n; i++) {
			nSet.add(br.readLine());
		}

		for(int i = 0; i < m; i++) {
			mSet.add(br.readLine());
		}

		nSet.retainAll(mSet);

		System.out.println(nSet.size());
		for (String result : nSet) {
			System.out.println(result);
		}
	}

	void reference() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());

		HashMap<String, String> map = new HashMap<>();
		TreeMap<String, String> result = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			String word = br.readLine();
			map.put(word, word);
		}

		for (int i = 0; i < m; i++) {
			String find =  br.readLine();
			if (map.containsKey(find)) {
				result.put(find, find);
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(result.size()).append("\n");

		result.forEach((k, v) -> sb.append(k).append("\n"));

		System.out.print(sb);
	}
}
