package com.structure.linkedList;

/**
 * @author JHM
 * @create 2019-01-14 20:33
 */
public class LinkedList<E> {

    private Node<E> dummyHead;
    private int size;

    public LinkedList(){
        dummyHead = new Node();
        size = 0;
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 添加一个元素
     * @param index
     * @param e
     */
    public void add(int index,E e){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Index Error");
        }
        Node<E> pre = dummyHead;
        for (int i = 0 ; i < index ; i++)
            pre = pre.next;
        pre.next = new Node(e,pre.next);
        size++;
    }

    /**
     * 头部添加一个元素
     * @param e
     */
    public void addFirst(E e){
        add(0,e);
    }

    /**
     * 尾部添加一个元素
     * @param e
     */
    public void addLast(E e){
        add(size,e);
    }

    /**
     * 删除一个元素
     * @param index
     * @return
     */
    public E remove(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Index Error");
        }
        Node<E> pre = dummyHead;
        for (int i = 0;i < index;i++){
            pre = pre.next;
        }
        Node<E> req = pre.next;
        pre.next = req.next;
        req.next = null;
        size--;
        return req.e;
    }

    /**
     * 删除头部元素
     * @return
     */
    public E removeFirst(){
        return remove(0);
    }

    /**
     * 删除尾部元素
     * @return
     */
    public E removeLast(){
        return remove(size - 1);
    }

    /**
     * 获取指定元素数据
     * @param index
     * @return
     */
    public E get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Index Error");
        }
        Node<E> cur = dummyHead.next;
        for (int i = 0; i < index;i++){
            cur = cur.next;
        }
        return cur.e;
    }

    /**
     * 获取头部数据
     * @return
     */
    public E getFirst(){
        return get(0);
    }

    /**
     * 获取尾部数据
     * @return
     */
    public E getLast(){
        return get(size-1);
    }

    /**
     * 修改指定元素为e
     * @param index
     * @param e
     */
    public void set(int index, E e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Illegal index.");

        Node cur = dummyHead.next;
        for(int i = 0 ; i < index ; i ++)
            cur = cur.next;
        cur.e = e;
    }

    /**
     * 判断是否包含该元素
     * @param e
     * @return
     */
    public boolean contains(E e){
        Node<E> cur = dummyHead.next;
        while (cur != null){
            if(cur.e.equals(e)){
                return true;
            }else {
                cur = cur.next;
            }
        }
        return false;
    }

    /**
     * 删除元素e
     * @param e
     */
    public void removeElement(E e){
        Node<E> pre = dummyHead;
        while (pre.next != null){
            if (pre.next.e.equals(e)){
                break;
            }else {
                pre.next = pre.next.next;
            }
        }
        if (pre.next != null){
            Node<E> delNode = pre.next;
            pre.next = delNode.next;
            delNode.next = null;
            size--;
        }
    }
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();

        Node cur = dummyHead.next;
        while(cur != null){
            res.append(cur.e + "->");
            cur = cur.next;
        }
        res.append("NULL");

        return res.toString();
    }
    /**
     * 内部节点类
     * @param <E>
     */
    private class Node<E>{
        public E e;
        public Node next;
        public Node(){
            this(null,null);
        }
        public Node(E e){
            this(e,null);
        }
        public Node(E e,Node next){
            this.e = e;
            this.next = next;
        }
    }
}
