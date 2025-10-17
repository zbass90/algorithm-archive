package com.kecleup.task.day1;

import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class Problem4 {
    public static void main(String[] args) {
        int[] A = {5, 2, 3, 2, 8, 5, 1, 8, 0, 7 , 7 , 3, 10, 10, 9};
        splitDedupSortAndPrint(A);
        // 기대 출력 예
        // even: 0 2 8 10
        // odd: 1 3 5 7 9
    }

    private static void splitDedupSortAndPrint(int[] a) {
        Set<Integer> evenSet = new TreeSet<>();
        Set<Integer> oddSet = new TreeSet<>();

        for (int num : a) {
            if(num % 2 == 0) {
                evenSet.add(num);
            } else {
                oddSet.add(num);
            }
        }

        printEvenString(evenSet);
        printOddString(evenSet);
    }

    private static void printEvenString(Set<Integer> numSet) {
        StringJoiner sj = getJoinString(numSet);
        System.out.println("even: " + sj);
    }

    private static void printOddString(Set<Integer> numSet) {
        StringJoiner sj = getJoinString(numSet);
        System.out.println("odd: " + sj);
    }

    private static StringJoiner getJoinString(Set<Integer> set) {
        StringJoiner sj = new StringJoiner(" ");
        for (int n : set) sj.add(String.valueOf(n));
        return sj;
    }
}
