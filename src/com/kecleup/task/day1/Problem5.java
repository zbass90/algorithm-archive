package com.kecleup.task.day1;

public class Problem5 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 100, 1_000_000};
        for (int num : numbers) {
            System.out.println("N=" + num + " => primes=" + countPrimes(num));
        }
    }

    private static int countPrimes(int num) {
        int[] arr = new int[num+1];
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (arr[i] == 0) {
                count++;
                for (int j = i * 2; j <= num; j += i) {
                    arr[j] = 1;
                }
            }
        }
        return count;
    }
}
