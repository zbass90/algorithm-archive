package com.inflearn.codetest;

import java.util.Scanner;

public class ReverseAlphabet {
    public void main(){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        char[] arr = str.toCharArray();

        int lt = 0;
        int rt = arr.length-1; //9

        while(lt < rt) { // 0 < 9
            char left = arr[lt];
            char right = arr[rt];

            // 문자가 소문자인지
            if(!Character.isAlphabetic(left)){
                lt++;
                // 문자가 대문자인지
            } else if( !Character.isAlphabetic(right)){
                rt--;
            }else {

                // 알파벳일때 교환
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;

                lt ++;
                rt --;
            }
        }

        // char[]을 String 으로
        String answer = String.valueOf(arr);
        System.out.println(answer);
    }
}
