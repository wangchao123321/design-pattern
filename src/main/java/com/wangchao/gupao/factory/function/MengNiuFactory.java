package com.wangchao.gupao.factory.function;

import com.wangchao.gupao.factory.MengNiu;
import com.wangchao.gupao.factory.Milk;

public class MengNiuFactory implements Factory {
    public Milk getMilk() {
        return new MengNiu();
    }
}
