package com.wangchao.gupao.singleton.hungry;

public class Hungry {

    private static final Hungry hungry  = new Hungry();

    private Hungry(){}

    public static Hungry getInstance(){
        System.out.println(System.currentTimeMillis() + ":" + hungry);
        return hungry;
    }



}
