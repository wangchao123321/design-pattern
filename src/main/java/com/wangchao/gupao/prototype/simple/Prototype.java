package com.wangchao.gupao.prototype.simple;

import java.util.ArrayList;

public class Prototype implements Cloneable {

    public String name;

    public ArrayList<CloneTarget> list = null;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
