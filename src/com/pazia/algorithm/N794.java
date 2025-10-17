package com.pazia.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class N794 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 가게 수
        int K = Integer.parseInt(st.nextToken()); // 채소 수

        int[] minPrice = new int[K];
        int[] minIdx   = new int[K];
//        Arrays.fill(minPrice, Integer.MAX_VALUE);
//        Arrays.fill(minIdx, -1);

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < K; j++) {
                int price = Integer.parseInt(st.nextToken());
                if (price < minPrice[j]) {
                    minPrice[j] = price;
                    minIdx[j] = i; // 채소 j의 최저가 가게는 i
                }
            }
        }

        Set<Integer> shops = new HashSet<>();
        for (int j = 0; j < K; j++) shops.add(minIdx[j]);
        System.out.println(shops.size());

//        for(int[] a : arr) {
//            for(int n : a) {
//                System.out.print(n + " , ");
//            }
//            System.out.println();
//        }
    }
}
