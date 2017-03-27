package com.win.java.se.task2;

public enum Values {
    VALUE1("value1"), VALUE2("value2"), VALUE3("value3");

    private String identifier;

    Values(String s) {
        this.identifier = s;
    }

    public String getIdentifier() {
        return this.identifier;
    }
}
