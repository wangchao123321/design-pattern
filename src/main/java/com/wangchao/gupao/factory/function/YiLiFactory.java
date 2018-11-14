package com.wangchao.gupao.factory.function;

import com.wangchao.gupao.factory.Milk;
import com.wangchao.gupao.factory.YiLi;

public class YiLiFactory implements Factory {
    public Milk getMilk() {
        return new YiLi();
    }
}
