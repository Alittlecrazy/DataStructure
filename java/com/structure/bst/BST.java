package com.structure.bst;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author JHM
 * @create 2019-01-16 19:09
 */
public class BST<E extends Comparable> {
    private Node root;
    private int size;

    public BST(){
        root = null;
        size = 0;
    }

    /**
     * 获取元素数
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 添加新元素
     * @param e
     */
    public void add(E e){
        root = add(root,e);
    }
    private Node add(Node node,E e){
        if (node == null){
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0)
            node.left = add(node.left,e);
        else if (e.compareTo(node.e) > 0)
            node.right = add(node.right,e);
        return node;
    }

    /**
     * 是否包含元素 e
     * @param e
     * @return
     */
    public boolean contains(E e){
        return contains(root,e);
    }
    private boolean contains(Node node,E e){
        if (node == null)
            return false;
        if (e.compareTo(node.e) == 0)
            return true;
        else if (e.compareTo(node.left) < 0)
            contains(node.left,e);
        else if (e.compareTo(node.e) > 0)
            contains(node.right,e);
        return true;
    }
    /**
     * 前序遍历
     */
    public void preOrder(){
        if (isEmpty()){
            throw new IllegalArgumentException("Empty");
        }
        preOrder(root);
    }
    private void preOrder(Node node){
        if (node == null)
            return;
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 中序遍历
     */
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if (node == null)
            return;
        preOrder(node.left);
        System.out.println(node.e);
        preOrder(node.right);
    }

    /**
     * 后序遍历
     */
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if (node == null)
            return;
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.e);
    }

    /**
     * 层序遍历
     */
    public void levelOrder(){
        if (root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node cur = queue.remove();
            System.out.println(cur.e);
            if (cur.left != null){
                queue.add(cur.left);
            }
            if (cur.right != null){
                queue.add(cur.right);
            }
        }
    }

    /**
     * 查找最小值
     * @return
     */
    public E minmum(){
        if (isEmpty()){
            throw new IllegalArgumentException("Empty");
        }
        return minmum(root).e;
    }
    private Node minmum(Node node){
        if (node.left == null){
            return node;
        }
        return minmum(node.left);
    }

    /**
     * 查找最大值
     * @return
     */
    public E maxmum(){
        if (isEmpty())
            throw new IllegalArgumentException("Empty");
        return maxmum(root).e;
    }
    private Node maxmum(Node node){
        if (node.right == null){
            return node;
        }
        return minmum(node.right);
    }

    /**
     * 删除最小值
     * @return
     */
    public E removeMin(){
        if (isEmpty())
            throw new IllegalArgumentException("Empty");
        E ret = minmum();
        root = removeMin(root);
        return ret;
    }
    private Node removeMin(Node node){
        if (node.left == null){
            Node right = node.right;
            node.right = null;
            return right;
        }
        node.left = removeMin(node.left);
        return node;
    }

    /**
     * 删除最大值
     * @return
     */
    public E removeMax(){
        if (isEmpty())
            throw new IllegalArgumentException("Empty");
        E ret = maxmum();
        root = removeMax(root);
        return ret;
    }
    private Node removeMax(Node node){
        if (node.right == null){
            Node left = node.left;
            node.left = null;
            return left;
        }
        node.right = removeMax(node.right);
        return node;
    }
    private class Node{
        public E e;
        public Node left,right;
        public Node(E e){
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }
}
