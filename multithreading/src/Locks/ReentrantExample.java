package Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//deadlock =  outermehtod is lock now when try method run outer method print and call innermethod but in innermethod again we are calling lock.lock so our main function needs to wait until he himself finish that is called dead lockl
public class ReentrantExample {  // java handel deadlock situtation by keeping the count no . of lock and unlock of both of them are qual then the situtaiton will not occur

    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try {
            System.out.println("Outer Method");
            innerMethod();
        }finally {
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("inner method");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        example.outerMethod();
    }
}
