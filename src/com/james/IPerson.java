package com.james;

public interface IPerson<T> {
    String getName();
    int getID();
    T data;
}
