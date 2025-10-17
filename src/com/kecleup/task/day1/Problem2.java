package com.kecleup.task.day1;

public class Problem2 {
    public static void main(String[] args) {
        int[] A = { 3, 7 , -2, 10, 4 };
        int[] B = { 5 };
        printStats(A);
        printStats(B);
    }

    private static void printStats(int[] a) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;
        for(int num : a) {
            if (min > num) min = num;
            if (max < num) max = num;
            sum += num;
        }
        double avg = (double) sum / a.length;
        System.out.printf("min : %d, max : %d, sum : %d, avg : %.2f\n", min, max, sum, avg);
    }


}
