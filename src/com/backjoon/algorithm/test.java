package com.backjoon.algorithm;

public class test {
    public static void main(String[] args) {
        int numer1 = 1;
        int numer2 = 1;

        int denom1 = 60;
        int denom2 = 48;


        int lcmValue = lcm(denom1, denom2);
        int up = numer1 * (lcmValue / denom1) + numer2 * (lcmValue / denom2);
        int down = lcmValue;
        int gcdValue = gcd(up, down);
        int[] answer = {up / gcdValue, down / gcdValue};
        System.out.println(lcmValue);
        System.out.println(answer[0] + " ," + answer[1]);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    static int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

}
