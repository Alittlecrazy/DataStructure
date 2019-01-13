package com.structure.queue;

/**
 * @author JHM
 * @create 2019-01-13 13:06
 */
public interface Queue<E> {
    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
