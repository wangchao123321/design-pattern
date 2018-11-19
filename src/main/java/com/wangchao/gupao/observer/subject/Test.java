package com.wangchao.gupao.observer.subject;

import com.wangchao.gupao.observer.core.Event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Observer observer = new Observer();
        Method advice = observer.getClass().getMethod("advece", Event.class);

        Subject subject = new Subject();
        subject.addLisener(SubjectEventType.ON_ADD,observer,advice);

        subject.add();
    }

}
