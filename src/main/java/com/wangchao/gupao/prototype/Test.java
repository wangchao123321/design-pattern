package com.wangchao.gupao.prototype;

import com.wangchao.gupao.prototype.deep.QiTianDaSheng;
import com.wangchao.gupao.prototype.simple.CloneTarget;
import com.wangchao.gupao.prototype.simple.Prototype;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
//        Prototype p = new Prototype();
//        p.name = "tom";
//        p.list = new ArrayList<CloneTarget>();
//        p.list.add(new CloneTarget());
//
//        try {
//            Object o = p.clone();
//            System.out.println(o);
//            System.out.println(p);
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }


        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        try {
            QiTianDaSheng clone = (QiTianDaSheng)qiTianDaSheng.clone();

            System.out.println(qiTianDaSheng.jinGuBang == clone.jinGuBang);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
