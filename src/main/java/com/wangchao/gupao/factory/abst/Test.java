package com.wangchao.gupao.factory.abst;

import com.wangchao.gupao.factory.function.MengNiuFactory;

public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new MilkFactory();
        System.out.println(factory.getMengNiu().getName());
    }
}
