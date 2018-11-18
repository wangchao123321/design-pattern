package com.wangchao.gupao.proxy.staticed;

public class Test {

    public static void main(String[] args) {
        Father father = new Father(new Person());
        father.findLove();
    }

}
