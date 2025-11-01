package com.backjoon.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class N7568 {
	public static class Person{
		private final int weight;
		private final int height;
		private int rank = 1;

		public Person(int weight, int height) {
			this.weight = weight;
			this.height = height;
		}

		public void computeRank(List<Person> people) {
			for (Person person : people) {
				if (person == this) continue;
				if (person.weight > this.weight && person.height > this.height) {
					this.rank++;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int peopleCnt = Integer.parseInt(br.readLine());
		List<Person> personList = new ArrayList<>();

		for (int i = 0; i < peopleCnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int weight = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			personList.add(new Person(weight, height));
		}

		for (Person person : personList) {
			person.computeRank(personList);
		}

		personList.forEach(p -> System.out.print(p.rank + " "));
	}
}
