package com.wangchao.gupao.singleton.lazy;

public class LazyThree {

    //默认使用LazyThree的时候，会先初始化内部类
    //如果没有使用的话，内部类是不加载的
    private static boolean init = false;

    private LazyThree(){
        // 防反射入侵
        synchronized (LazyThree.class){
            if(init == false){
                init = !init;
            }else {
                throw new RuntimeException("单例已被去侵犯");
            }
        }

    }


    public static final LazyThree getInstance(){
        return LazyHolder.LAZY;
    }


    private static class LazyHolder{
        private static final LazyThree LAZY = new LazyThree();
    }
}
