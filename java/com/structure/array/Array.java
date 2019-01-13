package com.structure.array;

/**
 * 数组 自定义容器
 * @author JHM
 * @create 2019-01-12 11:46
 */
public class Array<E> {
    private E[] data;
    private int size;
    /**
     * 初始化容器 默认容量为10
     */
    public Array(){
        data = (E[])new Object[10];
        size = 0;
    }
    /**
     * 初始化容器 可以指定容器容量大小
     * @param Capacity 容量大小
     */
    public Array(int Capacity){
        data = (E[])new Object[Capacity];
        size = 0;
    }

    /**
     * 添加元素 追加至容器末尾
     * @param element
     */
    public void addLast(E element){
        addByIndex(size,element);
    }

    /**
     * 在容器第一位插入一个元素
     * @param element
     */
    public void addFirst(E element){
        addByIndex(0,element);
    }

    /**
     * 指定位置插入元素
     * @param index
     * @param element
     */
    public void addByIndex(int index,E element){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Index Error");
        }
        if(size == data.length){
            resize(2 * data.length);
        }

        for (int i = size ; i > index ; i--){
            data[i] = data[i-1];
        }
        data[index] = element;
        size++;
    }

    /**
     * 删除最后一个元素
     * @return size
     */
    public E removeLast(){
        return removeByIndex(size - 1);
    }

    /**
     * 删除首位元素
     * @return
     */
    public E removeFirst(){
        return removeByIndex(0);
    }

    /**
     * 获取指定位置的元素
     * @param index
     * @return
     */
    public E get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Index Error");
        return data[index];
    }

    /**
     * 获取首位元素
     * @return
     */
    public E getFirst(){
        return get(0);
    }

    /**
     * 获取最后一个元素
     * @return
     */
    public E getLast(){
        return get(size - 1);
    }
    /**
     * 修改指定位置的元素值
     * @param index
     * @param element
     */
    public void set(int index,E element){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Index Error");
        data[index] = element;
    }

    /**
     * 判断容器中是否包含元素
     * @param element
     * @return
     */
    public boolean contains(E element){
        for (int i = 0;i < size ; i++){
            if(element == data[i]){
                return true;
            }
        }
        return false;
    }

    /**
     * 查找该元素第一次出现的索引
     * @param element
     * @return
     */
    public int find(E element){
        for (int i = 0;i < size ; i++){
            if (element == data[i]){
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除指定位置的元素
     * @param index
     * @return
     */
    public E removeByIndex(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Index Error");
        }
        E ret = data[index];
        for (int i = index;i < size - 1; i++){
            data[i] = data[i+1];
        }
        size--;
        data[size] = null;  //clear to let GC do its work
        /** 如果这里设置成size == Capacity / 2 会发生复杂度震荡
         *  所以采用lazy机制 当size == Capacity / 4 时才进行缩容
         * if(size == data.length / 2)
            resize(data.length / 2);
         */
        if(size == data.length / 4 && data.length / 2 != 0)
            resize(data.length / 2);
        return ret;
    }

    /**
     * 删除元素 只删除第一个
     * @param element
     */
    public void removeElement(E element){
        int index = find(element);
        removeByIndex(index);
    }

    /**
     * 扩容
     */
    private void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity];
        for (int i = 0; i < size ;i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    /**
     * 获取容器中有多少个元素
     * @return size
     */
    public int getSize(){
        return size;
    }

    /**
     * 获取容器容量大小
     * @return
     */
    public int getCapacity(){
        return data.length;
    }

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
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
