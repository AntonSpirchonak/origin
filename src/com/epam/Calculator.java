package com.epam;

public interface Calculator<T> {
    Long add(Long first, Long second);
    Long diff(Long first, Long second);
    T multiple(T first, T second);
    T divide(T first, T second);
}
