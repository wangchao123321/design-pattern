package com.wangchao.gupao.factory.simple;

import com.wangchao.gupao.factory.MengNiu;
import com.wangchao.gupao.factory.Milk;
import com.wangchao.gupao.factory.TeLunSu;
import com.wangchao.gupao.factory.YiLi;

public class SimpleFactory {

    public Milk getMilk(String name){
        if("特仑苏".equals(name)){
            return new TeLunSu();
        }else if ("伊利".equals(name)){
            return new YiLi();
        }else if ("蒙牛".equals(name)){
            return new MengNiu();
        }
        return null;
    }

}
