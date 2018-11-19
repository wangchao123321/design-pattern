package com.wangchao.gupao.observer.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EventLisener {

    protected Map<Enum,Event> events = new HashMap<Enum, Event>();

    public void addLisener(Enum evenType, Object target, Method callback){
        events.put(evenType,new Event(target,callback));
    }

    protected void trigger(Enum call) throws InvocationTargetException, IllegalAccessException {
        if(!this.events.containsKey(call)){
            return;
        }
        Event event = this.events.get(call);
        event.setTrigger(call.toString());
        trigger(event);
    }

    private void trigger(Event e) throws InvocationTargetException, IllegalAccessException {
        e.setSource(this);
        e.setTime(System.currentTimeMillis());

        e.getCallback().invoke(e.getTarget(),e);
    }
}
