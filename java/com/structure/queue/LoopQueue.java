package com.structure.queue;

/**
 * @author JHM
 * @create 2019-01-13 18:47
 */
public class LoopQueue<E> implements Queue<E>{

    private E[] data;
    private int front;
    private int tail;
    private int size;
    public LoopQueue(){
        this(10);
    }
    public LoopQueue(int capacity){
        data = (E[])new Object[capacity + 1];
        size = 0;
        front = 0;
        tail = 0;
    }

    /**
     * 获取元素数量
     * @return
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * 获取容量
     * @return
     */
    public int getCapacity(){
        return data.length - 1;
    }

    /**
     * 判断是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    /**
     * 进队列
     * @param e
     */
    @Override
    public void enqueue(E e) {
        if ((tail+1) % data.length == front)
            resize(2 * getCapacity());
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    /**
     * 出队列
     * @return
     */
    @Override
    public E dequeue() {
        if(isEmpty()){
            throw new IllegalArgumentException("Queue is empty");
        }
        E req = data[front];
        data[front] = null;
        front = (front+1) % data.length;
        size--;
        if(size == getCapacity() / 4 && getCapacity() / 2 != 0)
            resize(getCapacity() / 2);
        return req;
    }

    /**
     * 获取队首元素
     * @return
     */
    @Override
    public E getFront() {
        if (isEmpty()){
            throw new IllegalArgumentException("Queue is empty");
        }
        return data[front];
    }

    /**
     * 动态改变容量
     * @param capacity
     */
    private void resize(int capacity){
        E[] newData = (E[])new Object[capacity + 1];
        for (int i = 0;i < size;i++){
            newData[i] = data[(front+i) % data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("LoopQueue : front [");
        for (int i = 0;i < size;i++){
            builder.append(data[(front+i) % data.length]);
            if (i != size - 1)
                builder.append(",");
        }
        builder.append("] tail");
        return builder.toString();
    }
}
