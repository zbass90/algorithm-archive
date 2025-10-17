package com.kecleup.task.day1;

public class Problem3 {
    public static void main(String[] args) {
        analyze("");                    // 공백/빈 문자열
        analyze("  hello   world  ");   // 다중 공백
        analyze("java python javascript");
        analyze(null);                  // null
    }

    private static void analyze(String s1) {
        String str = s1 == null ? "" : s1.trim();
        int count = 0;
        if (str.isEmpty()) {
            System.out.printf("count : %d , longest : %s \n", count, str);
            return;
        }

        String[] strArr = str.split("\\s+");
        count = strArr.length;
        int maxLength = 0, maxIdx = 0;

        for (int i = 0; i < strArr.length; i++) {
            if (maxLength < strArr[i].length()) maxIdx = i;
        }

        System.out.printf("count : %d , longest : %s \n", count, strArr[maxIdx]);
    }
}
