package com.wangchao.gupao.strategy.pay;

import com.wangchao.gupao.strategy.pay.payport.AliPay;
import com.wangchao.gupao.strategy.pay.payport.PayType;
import com.wangchao.gupao.strategy.pay.payport.WechatPay;

public class Test {

    public static void main(String[] args) {
        Order order = new Order("1","2018111811111",324.45);
        System.out.println(order.pay(PayType.ALI_PAY));
    }
}
