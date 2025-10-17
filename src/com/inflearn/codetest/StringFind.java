package com.inflearn.codetest;

import java.util.Locale;
import java.util.Scanner;

public class StringFind {

    public long result(){
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();

        long res =  countChar(input1.toUpperCase(Locale.ROOT), input2.toUpperCase().charAt(0));

        return res;
    }

    public long countChar(String str, char ch){
        return str.chars()
                .filter(a-> a == ch)
                .count();
    }
}
