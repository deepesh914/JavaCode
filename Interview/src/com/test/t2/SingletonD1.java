package com.test.t2;

//Given a list of employee, find maximum age of employee?

// class student -> id and age. 
//input int[] abc= {1,0,1,0,1,0,1 }
//output 0,0,0,1,1,1,1

//ImmutableClass

public final class SingletonD1 {

    private final int    id;
    private final String name;

    public SingletonD1(int id, String name) {
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
