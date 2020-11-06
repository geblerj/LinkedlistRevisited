package com.james;

public class Student<T> implements IPerson<T> {
    private int id;
    private String name;
    T data;

    public Student(String name, int id, T data) {
        this.id = id;
        this.name = name;
        this.data = data;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getID() {
        return this.id;
    }
}
