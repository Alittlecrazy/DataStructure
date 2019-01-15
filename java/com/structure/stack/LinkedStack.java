package com.structure.stack;

import com.structure.linkedList.LinkedList;

/**
 * @author JHM
 * @create 2019-01-15 20:14
 */
public class LinkedStack<E> implements Stack<E>{

    private LinkedList<E> data;

    public LinkedStack(){
        data = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return data.getSize();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }


    @Override
    public void push(E e) {
        data.addFirst(e);
    }

    @Override
    public E pop() {
        return data.removeFirst();
    }

    @Override
    public E peek() {
        return data.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("LinkedStack : Top [");
        for (int i = 0;i < getSize();i++){
            builder.append(data.get(i));
            if (i != getSize() - 1){
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
