package com.kecleup.task.day2;

public enum Show {
    MATINEE(-2000),
    STANDARD(0),
    LATE(-1000);

    private final int fee;

    Show(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }
}
