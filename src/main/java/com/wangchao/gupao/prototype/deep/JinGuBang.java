package com.wangchao.gupao.prototype.deep;

import java.io.Serializable;

public class JinGuBang implements Serializable {

    private float h = 100;
    private float d = 10;

    public void max(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }

}
