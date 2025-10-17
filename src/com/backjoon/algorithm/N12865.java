package com.backjoon.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N12865 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int stockNum = Integer.parseInt(st.nextToken());   // N
        int limitWeight = Integer.parseInt(st.nextToken()); // K

        int[] dp = new int[limitWeight + 1];

        for (int i = 0; i < stockNum; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int w = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            // 0/1 배낭: 같은 물건을 두 번 쓰지 않도록 용량을 역순으로 갱신
            for (int weight = limitWeight; weight >= w; weight--) {
                dp[weight] = Math.max(dp[weight], dp[weight - w] + v);
            }
        }

        System.out.println(dp[limitWeight]);
    }
}
