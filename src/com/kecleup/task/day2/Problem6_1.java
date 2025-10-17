package com.kecleup.task.day2;

public class Problem6_1 {
    public static void main(String[] args) {
        System.out.println(price(Age.ADULT, Day.WEEKDAY)); // 12000 (출력)
        System.out.println(price(Age.ADULT, Day.WEEKEND)); // 14000 (출력)
        System.out.println(price(Age.CHILD, Day.WEEKDAY)); // 7000 (출력)
        System.out.println(price(Age.SENIOR, Day.WEEKEND)); // 10000 (출력)
    }

    private static int price(Age age, Day day) {
        return age.getFee() + day.getFee();
    }
}
