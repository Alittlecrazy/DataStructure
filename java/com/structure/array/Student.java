package com.structure.array;

/**
 * @author JHM
 * @create 2019-01-12 16:32
 */
public class Student {
    private String name;
    private int age;
    public Student(){
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student(" + this.name + "," + this.age + ")";
    }

    public static void main(String[] args) {
        Array<Student> array = new Array<>();
        array.add(new Student("zhangsan",23));
        array.add(new Student("lisi",24));
        array.add(new Student("wangwu",25));
        System.out.println(array);
    }
}
