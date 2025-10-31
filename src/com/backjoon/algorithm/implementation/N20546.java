package com.backjoon.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N20546 {
	public static class Person {
		private int money;
		private int stock;

		protected Person(int money, int stock) {
			this.money = money;
			this.stock = stock;
		}

		public Person buyStock(int stockPrice) {
			int buy = this.money / stockPrice;
			if (buy <= 0) return this;
			int remainMoney = this.money - (buy * stockPrice);
			int remainStock = this.stock + buy;
			return new Person(remainMoney, remainStock);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int money = Integer.parseInt(br.readLine());

		Person bnp = new Person(money, 0);
		Person timing = new Person(money, 0);

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] stockPrice = new int[st.countTokens()];
		for (int i = 0; i < stockPrice.length; i++) {
			stockPrice[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < stockPrice.length; i++) {
			bnp.buyStock(stockPrice[i]);
		}

		int upCnt = 0;
		int downCnt = 0;

		for (int i = 1; i < stockPrice.length; i++) {
			if (stockPrice[i] > stockPrice[i - 1]) {
				upCnt++; downCnt = 0;
			}
			else if (stockPrice[i] < stockPrice[i - 1]) {
				upCnt = 0; downCnt++;
			}
			else {
				upCnt = 0; downCnt = 0;
			}

			if (upCnt >= 3) {
				int remainMoney = timing.money + (timing.stock * stockPrice[i]);
				timing.money = remainMoney;
				timing.stock = 0;
			}

			if (downCnt >= 3) {
				timing.buyStock(stockPrice[i]);
			}
		}

		int bnpTotal = bnp.money + (stockPrice[stockPrice.length - 1] * bnp.stock);
		int timTotal = timing.money + (stockPrice[stockPrice.length - 1] * timing.stock);

		if (bnpTotal > timTotal) {
			System.out.println("BNP");
		} else if (bnpTotal < timTotal) {
			System.out.println("TIMING");
		} else {
			System.out.println("SAMESAME");
		}
	}
}