package com.inflearn.codetest;

import java.util.Locale;
import java.util.Scanner;

public class UpperLowerChange {


    public void main(){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        input1.chars()
                .mapToObj(i -> (char)i)
                .map(i-> {
                    if(Character.isUpperCase(i)){
                        return i.toString().toLowerCase(Locale.ROOT);
                    }else{
                        return i.toString().toUpperCase(Locale.ROOT);
                    }
                } )
                .forEach(System.out::print);
        //Character.isUpperCase(i) ? i.toString().toLowerCase(Locale.ROOT) : i.toString().toUpperCase(Locale.ROOT)
    }
}
