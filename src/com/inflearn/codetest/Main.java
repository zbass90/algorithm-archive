package com.inflearn.codetest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int total;
    static int n;
    static String answer = "NO";
    static boolean flag = false;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }
        DFS(0, 0, arr);

        System.out.println(answer);

    }


    public static void DFS(int i, int sum, int[] arr){
        if(flag) return;
        if(i == n){
            if( (total - sum ) == sum ){
                answer = "YES";
                flag = true;
                return;
            }
        }else{
            DFS(i+1, sum + arr[i], arr );
            DFS(i+1, sum, arr);
        }
    }

}

