package com.wangchao.gupao.factory.abst;

import com.wangchao.gupao.factory.MengNiu;
import com.wangchao.gupao.factory.Milk;
import com.wangchao.gupao.factory.TeLunSu;
import com.wangchao.gupao.factory.YiLi;
import com.wangchao.gupao.factory.function.MengNiuFactory;
import com.wangchao.gupao.factory.function.TeLunSuFactory;
import com.wangchao.gupao.factory.function.YiLiFactory;

public class MilkFactory extends AbstractFactory {
    public Milk getMengNiu() {
        return new MengNiu();
    }

    public Milk getYiLi() {
        return new YiLi();
    }

    public Milk getTeLunSu() {
        return new TeLunSu();
    }
}
