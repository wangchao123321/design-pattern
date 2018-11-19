package com.wangchao.gupao.strategy.pay;

public class PayState {

    private int code;
    private Object data;
    private String msg;

    public PayState(int code, String msg, Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "{" +
                "支付状态=" + code +
                ", 交易详情=" + data +
                ", 交易信息='" + msg + '\'' +
                '}';
    }
}
