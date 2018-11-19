package com.wangchao.gupao.strategy.pay.payport;

import com.wangchao.gupao.strategy.pay.PayState;

public class WechatPay implements Payment {
    public PayState pay(String uid, double amount) {
        System.out.println("微信支付");
        return new PayState(200,"微信支付成功",amount);
    }
}
