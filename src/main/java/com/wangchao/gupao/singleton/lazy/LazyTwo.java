package com.wangchao.gupao.singleton.lazy;

public class LazyTwo {

    private static LazyTwo lazyOne = null;

    private LazyTwo(){}

    public static synchronized LazyTwo getInstance(){
        if(lazyOne == null){
            lazyOne = new LazyTwo();
        }
        return lazyOne;
    }

}
