package com.example;

public class Child extends Parent{

    public int c = 30;

    void display(){
//        System.out.println(a); -> 얘는 상속 못받음.
        System.out.println(b);
        System.out.println(c);
    }
}
