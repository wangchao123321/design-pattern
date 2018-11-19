package com.wangchao.gupao.strategy.pay.payport;

import com.wangchao.gupao.strategy.pay.PayState;

public interface Payment {

    Payment ALI_PAY = new AliPay();
    Payment WEICHAT_PAY = new WechatPay();

    PayState pay(String uid, double amount);

}
