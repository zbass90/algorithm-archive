package com.pazia.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N791 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        int chk = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                arr[i][j] = chk++;
            }
        }

        for(int[] a : arr) {
            for(int i : a) {
                System.out.print(i + " ,");
            }
            System.out.println();
        }

        System.out.println(arr.length);
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


    }
}
