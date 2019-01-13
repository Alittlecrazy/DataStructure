package com.structure.stack;

/**
 * @author JHM
 * @create 2019-01-13 12:28
 */
public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
