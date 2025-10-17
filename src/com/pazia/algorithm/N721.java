package com.pazia.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class N721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Map<Integer, int[]> pos = new HashMap<>(N * N);

        for (int r = 0; r < N; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < N; c++) {
                int val = Integer.parseInt(st.nextToken());
                pos.put(val, new int[]{r, c});
            }
        }

        st = new StringTokenizer(br.readLine());
        int[] drawn = new int[K];
        for (int i = 0; i < K; i++) {
            drawn[i] = Integer.parseInt(st.nextToken());
        }

        boolean[][] opened = new boolean[N][N];
        int[] rowCnt = new int[N];
        int[] colCnt = new int[N];
        int diagMain = 0;
        int diagAnti = 0;
        int centerR = N / 2;
        int centerC = N / 2;

        opened[centerR][centerC] = true;
        rowCnt[centerR]++;
        colCnt[centerC]++;
        if (centerR == centerC) diagMain++;
        if (centerR + centerC == N - 1) diagAnti++;

        for (int x : drawn) {
            int[] p = pos.get(x);
            if (p == null) continue;
            int r = p[0], c = p[1];
            if (opened[r][c]) continue;
            opened[r][c] = true;
            rowCnt[r]++;
            colCnt[c]++;
            if (r == c) diagMain++;
            if (r + c == N - 1) diagAnti++;
        }

        int bingo = 0;
        for (int i = 0; i < N; i++) if (rowCnt[i] == N) bingo++;
        for (int j = 0; j < N; j++) if (colCnt[j] == N) bingo++;
        if (diagMain == N) bingo++;
        if (diagAnti == N) bingo++;

        System.out.println(bingo);
    }
}
