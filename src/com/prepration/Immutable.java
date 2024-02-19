package com.prepration;

//1- make final class, so it won't be overridden
public final class Immutable {
    //2- make all variables as private final
    private final String value;

// create a public constructor where the values will be initialized
    public Immutable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
        Immutable immutable = new Immutable("hi");
        System.out.println(immutable.getValue());

    }
}
