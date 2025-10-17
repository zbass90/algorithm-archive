package com.kecleup.task.day2;

public enum Day {
    WEEKDAY(0),
    WEEKEND(2000);

    private final int fee;
    Day(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }
}
