package com.test.t2;

public final class ImmutableClass {

    private final int    id;
    private final String name;

    public ImmutableClass(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
