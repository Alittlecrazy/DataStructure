数据结构代码实现
==============

# 1 数组
  
## 1. 动态数组
  
  **实现方式：底层基于静态数组**
  
  Array<E>|复杂度
  :-----:|:----:
  addLast(e)|O(1)
  addFirst(e)|O(1)
  add(index,e)|O(n/2)=O()n
  removeLast()|O(1)
  removeFirst()|O(n)
  remove(index,e)|O(n/2)=O(n)
  set(index,e)|O(1)
  get(index)|O(1)
  contains(e)|O(n)
  find(e)|O(n)
  resize()|O(1)均摊
  
  **注:当添加一个元素容量已满进行扩容,再删除一个元素就缩容的话,就会不断的执行resize()操作,产生复杂度震荡,所以进行缩容的时候使用lazy的机制,当为容量的1/4的时候再进行缩容**
  
# 2 栈

**应用 ： 撤销操作,系统栈,括号匹配(leeCode中的题目)**

## 1.数组栈
   **实现方式:基于动态数组**
   
  ArrayStack<E>|复杂度
  :-----:|:----:
  push(e)|O(1)均摊
  E pop  |O(1)均摊
  E peek() | O(1)
  int getSize()|O(1)
  boolean isEmpty()|O(1)
  
## 2.链表栈
   **实现方式:基于链表**
  
# 3 队列

**应用 : 需要排队的业务都可以使用队列**

## 1.数组队列
   **实现方式 : 基于动态数组**
   
  ArrayQueue<E>|复杂度
  :-----:|:----:
  enqueue(e)|O(1)均摊
  E dequeue  |O(n)
  E front() | O(1)
  int getSize()|O(1)
  boolean isEmpty()|O(1)
   
## 2.循环队列
   **实现方式 : 循环数组**
   
  LoopQueue<E>|复杂度
  :-----:|:----:
  enqueue(e)|O(1)均摊
  E dequeue  |O(1)均摊
  E front() | O(1)
  int getSize()|O(1)
  boolean isEmpty()|O(1)

## 3.链表队列
   **实现方式 : 带尾指针的链表**
   
# 4 链表
  
  **实现方式 : Node(e,next)**
  
  LinkedList<E>|复杂度
  :-----:|:----:
  addLast(e)|O(n)
  addFirst|O(1)
  add(index)| O(n/2)=O(n)
  removeLast|O(n)
  removeFirst|O(1)
  remove(index)|O(n/2)=O(n)
  set(index,e)|O(n)
  get(index)|O(n)
  contains(e)|O(n)
  

