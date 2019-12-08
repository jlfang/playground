package org.jlfang.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Cris
 * @description
 * @date 2019/11/19
 */
public class ReentrantLockDemo implements Runnable{

    public static ReentrantLock lock = new ReentrantLock();
    public static Condition condition = lock.newCondition();

    public void run(){
        try{
            lock.lock();
            condition.await();
            System.out.println("Thread is going on");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockDemo tl = new ReentrantLockDemo();
        Thread t1 = new Thread(tl);
        t1.start();
        Thread.sleep(2000);
        System.out.println("sending signal to condition");
        lock.lock();
        //condition.signal();
        lock.unlock();


    }
}
