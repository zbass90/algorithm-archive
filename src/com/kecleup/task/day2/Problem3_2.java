package com.kecleup.task.day2;

public class Problem3_2 {
    public static void main(String[] args) {
        multiplicationTable();
    }

    private static void multiplicationTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d * %d = %2d\t", j, i, i * j);
            }
            System.out.println();
        }
    }
}
