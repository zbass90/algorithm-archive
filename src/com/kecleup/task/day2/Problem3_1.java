package com.kecleup.task.day2;

public class Problem3_1 {
    public static void main(String[] args) {
        multiplicationTable();
    }

    private static void multiplicationTable() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
