package com.kecleup.task.day2;

import java.util.Random;

public enum HandSign {
    ROCK('R'),
    PAPER('P'),
    SCISSORS('S');

    private final char code;
    private static final Random random = new Random();


    HandSign(char code) {
        this.code = code;
    }

    public static HandSign of(char c) {
        return switch (Character.toUpperCase(c)) {
            case 'R' -> ROCK;
            case 'P' -> PAPER;
            case 'S' -> SCISSORS;
            default -> throw new IllegalArgumentException("허용되지 않는 문자: " + c);
        };
    }

    public static HandSign randomChoice() {
        HandSign[] signs = HandSign.values();
        return signs[random.nextInt(signs.length)];
    }

    public boolean match(HandSign hs) {
        return switch (this) {
            case ROCK -> hs == SCISSORS;
            case SCISSORS -> hs == PAPER;
            case PAPER -> hs == ROCK;
        };
    }
}
