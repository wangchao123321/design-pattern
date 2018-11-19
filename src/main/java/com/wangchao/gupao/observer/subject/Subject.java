package com.wangchao.gupao.observer.subject;

import com.wangchao.gupao.observer.core.EventLisener;

import java.lang.reflect.InvocationTargetException;

public class Subject extends EventLisener {

    public void add() throws InvocationTargetException, IllegalAccessException {
        System.out.println("调用添加方法");
        trigger(SubjectEventType.ON_ADD);
    }

    public void remove() throws InvocationTargetException, IllegalAccessException {
        System.out.println("调用删除方法");
        trigger(SubjectEventType.ON_REMOVE);
    }
}
