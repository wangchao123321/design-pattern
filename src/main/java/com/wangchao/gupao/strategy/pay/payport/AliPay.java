package com.wangchao.gupao.strategy.pay.payport;

import com.wangchao.gupao.strategy.pay.PayState;

public class AliPay implements Payment {
    public PayState pay(String uid, double amount) {
        System.out.println("支付宝");
        return new PayState(200,"支付宝支付成功",amount);
    }
}
