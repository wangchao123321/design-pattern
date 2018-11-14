package com.wangchao.gupao.factory.function;

public class Test {

    public static void main(String[] args) {
        Factory factory = new MengNiuFactory();
        System.out.println(factory.getMilk().getName());
    }

}
