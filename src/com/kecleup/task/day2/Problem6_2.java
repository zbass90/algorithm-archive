package com.kecleup.task.day2;


public class Problem6_2 {
//    [구현조건]
//    상영타입:
//        MATINEE(조조) −2,000
//        STANDARD 0
//        LATE(심야) −1,000
//    좌석 등급: STANDARD +0 / PRIME(좋은 좌석) +3,000
//    최소요금 하한: 최종가가 5,000 미만이면 5,000으로 올림
    public static void main(String[] args) {
        System.out.println(price(Age.ADULT, Seat.STANDARD, Day.WEEKDAY, Show.STANDARD)); // 12000
        System.out.println(price(Age.ADULT, Seat.PRIME, Day.WEEKEND, Show.MATINEE)); // 15000 (=12000+3000+2000-2000)
        System.out.println(price(Age.CHILD, Seat.STANDARD, Day.WEEKDAY, Show.MATINEE)); // 5000 (하한 적용: 7000-2000=5000)
        System.out.println(price(Age.SENIOR, Seat.PRIME, Day.WEEKDAY, Show.LATE)); // 10000 (=8000+3000-1000)
    }

    private static int price(Age age, Seat seat, Day day, Show show) {
        return age.getFee() + seat.getFee() + day.getFee() + show.getFee();
    }
}
