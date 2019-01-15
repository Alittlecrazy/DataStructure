package com.structure.queue;

/**
 * 带有尾指针的链表实现队列
 * @author JHM
 * @create 2019-01-15 20:39
 */
public class LinkedQueue<E> implements Queue<E> {
    private class Node{
        public E e;
        public Node next;
        public Node(){
            this(null,null);
        }
        public Node(E e){
            this.e = e;
            this.next = null;
        }
        public Node(E e,Node next){
            this.e = e;
            this.next = next;
        }
    }

    private Node head,tail;
    private int size;

    public LinkedQueue(){
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e){
        if(tail == null){
            tail = new Node(e);
            head = tail;
        }
        else{
            tail.next = new Node(e);
            tail = tail.next;
        }
        size ++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()){
            throw new IllegalArgumentException("Empty");
        }
        Node ret = head;
        head = head.next;
        ret.next = null;
        size--;
        if (head == null){
            tail = null;
        }
        return ret.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()){
            throw new IllegalArgumentException("Empty");
        }
        return head.e;
    }

    @Override
    public String toString() {
        Node cur = head;
        StringBuilder builder = new StringBuilder();
        builder.append("LinkedQueue : Front [");
        for (int i = 0;i < getSize();i++){
            if(cur == null){
                break;
            }
            builder.append(cur.e);
            cur = cur.next;
            if (i != getSize() - 1){
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }


}
