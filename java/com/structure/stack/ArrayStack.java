package com.structure.stack;

import com.structure.array.Array;

/**
 * @author JHM
 * @create 2019-01-13 12:30
 */
public class ArrayStack<E> implements Stack<E> {

    private Array<E> data;

    public ArrayStack(){
        data = new Array<>();
    }
    public ArrayStack(int capacity){
        data = new Array<>(capacity);
    }

    /**
     * 获取元素数量
     * @return
     */
    @Override
    public int getSize() {
        return data.getSize();
    }

    /**
     * 查看容器大小
     * @return
     */
    public int getCapacity(){
        return data.getCapacity();
    }
    /**
     * 判断是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * 进栈
     * @param e
     */
    @Override
    public void push(E e) {
        data.addLast(e);
    }

    /**
     * 出栈
     * @return
     */
    @Override
    public E pop() {
        return data.removeLast();
    }

    /**
     * 查看栈顶元素
     * @return
     */
    @Override
    public E peek() {
        return data.getLast();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Stack : [");
        for (int i = 0;i < data.getSize();i++){
            builder.append(data.get(i));
            if (i != data.getSize() - 1){
                builder.append(",");
            }
        }
        builder.append("] Top");
        return builder.toString();
    }
}
