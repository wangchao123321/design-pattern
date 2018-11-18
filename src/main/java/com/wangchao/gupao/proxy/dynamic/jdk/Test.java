package com.wangchao.gupao.proxy.dynamic.jdk;

public class Test {

    public static void main(String[] args) {
        XieMu xieMu = new XieMu();
        Person object = (Person)new JDK58().getInctance(xieMu);
        object.job();
    }
}
