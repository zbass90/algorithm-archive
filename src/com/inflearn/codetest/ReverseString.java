package com.inflearn.codetest;

import java.util.Scanner;

public class ReverseString {
    public void main(){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        String[] arr = new String[input1];

        for(int i = 0 ; i < arr.length ; i++){
            String str  = in.next();
            StringBuilder sb = new StringBuilder(str);
            arr[i] = sb.reverse().toString();
        }

        for(String str : arr){
            System.out.println(str);
        }
    }
}
