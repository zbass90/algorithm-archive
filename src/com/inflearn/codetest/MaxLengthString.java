package com.inflearn.codetest;

import java.util.Arrays;
import java.util.Scanner;

public class MaxLengthString
{
    public void main(){
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        String[] arr = input1.split(" ");

        String str = Arrays.stream(arr).reduce("", (str1, str2) -> {
            if(str1.getBytes().length >= str2.getBytes().length){
                return str1;
            }else{
                return str2;
            }
        });

        System.out.println(str);
    }

    public static String longStr(String[] str){
        String result = "";
        for(String s : str ){
            if(s.length() > result.length()){
                result = s;
            }
        }
        return result;
    }
}
