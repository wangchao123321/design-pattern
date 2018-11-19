package com.wangchao.gupao.observer.subject;

import com.wangchao.gupao.observer.core.Event;

public class Observer {

    public void advece(Event event){
        System.out.println("触发事件打印日志" + event);
    }
}
