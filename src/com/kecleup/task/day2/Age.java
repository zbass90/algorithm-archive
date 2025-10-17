package com.kecleup.task.day2;

public enum Age {
    ADULT(12000),
    CHILD(7000),
    SENIOR(8000);

    private final int fee;

    Age(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }
}
