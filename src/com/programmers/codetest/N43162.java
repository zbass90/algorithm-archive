package com.programmers.codetest;

import java.util.ArrayDeque;
import java.util.Queue;

public class N43162 {
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0},{1, 1, 0},{0, 0, 1}};
        int answer = solution(n, computers);
        System.out.println(answer);
    }

    public static int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(i, computers, visited, n);
                answer++; // i에서 시작한 탐색 = 새로운 네트워크 하나
            }
        }
        return answer;
    }

    private static void bfs(int start, int[][] computers, boolean[] visited, int n) {
        Queue<Integer> q = new ArrayDeque<>();
        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int cur = q.poll();
            // 인접행렬이므로 0..n-1 모두 확인
            for (int next = 0; next < n; next++) {
                if (computers[cur][next] == 1 && !visited[next]) {
                    visited[next] = true;
                    q.add(next);
                }
            }
        }
    }
}
