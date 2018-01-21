package com.entity;

/**
 * Created by dima on 21.01.18.
 */
public enum Role {
    OWNER("OWNER"),
    USER("USER");

    private final String text;

    private Role(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
