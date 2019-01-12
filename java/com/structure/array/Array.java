package com.structure.array;

/**
 * 数组 自定义容器
 * @author JHM
 * @create 2019-01-12 11:46
 */
public class Array {
    private int[] data;
    private int size;
    /**
     * 初始化容器 默认容量为10
     */
    public Array(){
        data = new int[10];
        size = 0;
    }
    /**
     * 初始化容器 可以指定容器容量大小
     * @param Capacity 容量大小
     */
    public Array(int Capacity){
        data = new int[Capacity];
        size = 0;
    }

    /**
     * 添加元素 追加至容器末尾
     * @param element
     */
    public void add(int element){
        addByIndex(size,element);
    }

    /**
     * 在容器第一位插入一个元素
     * @param element
     */
    public void addFirst(int element){
        addByIndex(0,element);
    }
    public void addByIndex(int index,int element){
        if(size == data.length){
            throw new IllegalArgumentException("Capacity Full");
        }
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Index Error");
        }
        for (int i = size ; i > index ; i--){
            data[i] = data[i-1];
        }
        data[index] = element;
        size++;
    }
    /**
     * 获取容器中有多少个元素
     * @return size
     */
    public int size(){
        return size;
    }

    /**
     * 重写toString方法 打印容器的size Capacity 和 容器的元素
     * @return builder
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Array size: " + size + "    Array Capacity: " + data.length +"\n");

        builder.append("[");
        for (int i = 0;i < size ;i++){
            if(i != size-1){
                builder.append(data[i]);
                builder.append(",");
            }else {
                builder.append(data[i]);
                builder.append("]");
            }
        }
        return builder.toString();
    }
}
