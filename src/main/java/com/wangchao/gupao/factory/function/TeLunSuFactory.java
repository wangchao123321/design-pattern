package com.wangchao.gupao.factory.function;

import com.wangchao.gupao.factory.Milk;
import com.wangchao.gupao.factory.TeLunSu;

public class TeLunSuFactory implements Factory {
    public Milk getMilk() {
        return new TeLunSu();
    }
}
