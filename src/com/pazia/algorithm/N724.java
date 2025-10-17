package com.pazia.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N724 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num = Integer.parseInt(st.nextToken());
        int level = Integer.parseInt(st.nextToken());

        for(int i = 0; i < num; i++) {
            int fightLevel = Integer.parseInt(br.readLine());
            if (level > fightLevel) {
                level += fightLevel / 2;
            } else if (level < fightLevel) {
                level /= 2;
            }
        }

        System.out.println(level);
    }
}
