package main.core.impl;

public interface GBList <T> extends Iterable<T> {

    void add(T item);
    void remove(int index);
    T get(int index);

    void addFirst(Object value);

    void addLast(Object value);

    int size();

}