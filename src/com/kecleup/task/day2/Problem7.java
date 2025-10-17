package com.kecleup.task.day2;

import java.util.Arrays;

public class Problem7 {
    public static void main(String[] args) {
        char[] me = {'R', 'S', 'S', 'P', 'P', 'R'};
        int[] wins = winsByRound(me);
        // 라운드별 승리 여부 [0, 1, 1, 1, 0, 0]
        System.out.println(Arrays.toString(wins));
        // 최대 연속 승수 ( 3 )
        System.out.println(maxConsecutiveWins(wins));
    }

    private static int[] winsByRound(char[] me) {
        int[] result = new int[me.length];
        for (int i = 0; i < me.length; i++) {
            HandSign myChoice = HandSign.of(me[i]);
            HandSign oppChoice = HandSign.randomChoice();
            int matchResult = myChoice.match(oppChoice) ? 1 : 0;
            result[i] = matchResult;
        }
        return result;
    }

    private static int maxConsecutiveWins(int[] wins) {
        int maxWin = 0, currentWin = 0;
        for (int w : wins) {
            currentWin = w == 1 ? currentWin + 1 : 0;
            maxWin = Math.max(maxWin, currentWin);
        }
        return maxWin;
    }
}
