package com.kecleup.task.day1;

public class Problem1 {
//    점수 score(0~100)를 기준으로 90↑: A, 80↑: B, 70↑: C, 60↑: D, 나머지 F 출력
    enum Grade {A, B, C, D, F, INVALID}
    public static void main(String[] args) {
        int[] testScores = { -5, 20, 60, 70, 80, 90, 101 };
        for (int score : testScores) {
            System.out.printf("score : %d => grade : %s \n", score, getGrade(score));
        }
    }

    private static Grade getGrade(int score) {
        if (score < 0 || score > 100) return Grade.INVALID;

        return switch (score / 10) {
            case 10, 9 -> Grade.A;
            case 8 -> Grade.B;
            case 7 -> Grade.C;
            case 6 -> Grade.D;
            default -> Grade.F;
        };
    }


}
