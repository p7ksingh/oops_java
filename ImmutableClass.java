package com.arr.OOPs;

public final class ImmutableClass {
    private final int age;
    private final String name;
    private final String location;

    public ImmutableClass(int age, String name, String location) {
        this.age = age;
        this.name = name;
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
