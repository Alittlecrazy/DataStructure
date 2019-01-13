package com.structure.queue;

import com.structure.array.Array;

/**
 * @author JHM
 * @create 2019-01-13 13:15
 */
public class ArrayQueue<E> implements Queue<E>{
    private Array<E> array ;
    public ArrayQueue(){
        array = new Array<>();
    }
    public ArrayQueue(int capacity){
        array = new Array<>(capacity);
    }

    /**
     * 获取元素个数
     * @return
     */
    @Override
    public int getSize() {
        return array.getSize();
    }

    /**
     * 获取容器容量大小
     * @return
     */
    public int getCapacity(){
        return array.getCapacity();
    }

    /**
     * 判断是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    /**
     * 进入队列
     * @param e
     */
    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    /**
     * 出队列
     * @return
     */
    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    /**
     * 获取队首元素
     * @return
     */
    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Queue : Front [");
        for (int i = 0; i < array.getSize();i++){
            builder.append(array.get(i));
            if (i != array.getSize() - 1){
                builder.append(",");
            }
        }
        builder.append("] tail");
        return builder.toString();
    }
}
