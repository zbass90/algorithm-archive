package com.kecleup.task.day2;

public enum Seat {
    STANDARD(0),
    PRIME(3000);

    private final int fee;

    Seat(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }
}
