package com.wangchao.gupao.factory.simple;

import com.wangchao.gupao.factory.Milk;

public class Test {

    public static void main(String[] args) {

//        System.out.println(new TeLunSu().getName());

        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getMilk("伊利").getName());
    }

}
