package com.kecleup.task.day2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Problem5 {
//    1~45 범위에서 서로 다른 숫자 6개를 무작위로 뽑아 출력한다.
//    출력 형식은 자유.
    public static void main(String[] args) {
        printLottoNumbers();
    }

    private static void printLottoNumbers() {
        Set<Integer> lottoNum = new TreeSet<>();
        Random r = new Random();

        while(lottoNum.size() < 6) {
            int randomNum = r.nextInt(45) + 1;
            lottoNum.add(randomNum);
        }

        System.out.println(lottoNum);
    }
}
