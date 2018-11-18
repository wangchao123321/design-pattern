package com.wangchao.gupao.singleton;

import com.wangchao.gupao.singleton.Seriable.Seriable;
import com.wangchao.gupao.singleton.hungry.Hungry;
import com.wangchao.gupao.singleton.lazy.LazyOne;

import java.io.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class ThreadSafeTest {

    public static void main(String[] args) {

//        int count = 100;
//        final CountDownLatch latch = new CountDownLatch(count);
//
//        final Set<Hungry> syncSet = Collections.synchronizedSet(new HashSet<Hungry>());
//
//        for (int i = 0; i < count; i++) {
//            new Thread(){
//                @Override
//                public void run() {
//                    try {
//                        latch.await();
//                        Object object = LazyOne.getInstance();
//                        System.out.println(System.currentTimeMillis() + ":" + object);
//                    }catch (Exception e){
//                        e.printStackTrace();
//                    }
//                }
//            }.start();
//            latch.countDown();
//        }

        Seriable s1 = null;
        Seriable s2 = Seriable.getInstance();

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("Seriable.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("Seriable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (Seriable) ois.readObject();
            ois.close();

            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
