package Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;
    private Lock lock = new ReentrantLock();
    //lock.lock() it make the thread wait untill the lock becmome unlock work like syncronize

    public  void withdrawl(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
//        if(lock.tryLock()){
//
//        }else {
//
//        }
        try {
            if (lock.tryLock(1000, TimeUnit.MICROSECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal " + amount);
                        Thread.sleep(3000);
                        balance = balance - amount;
                        System.out.println(Thread.currentThread().getName() + " withdrawal complete, remaining balance: " + balance);
                    }catch (Exception e){

                    }finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            }else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try again later");
            }
        } catch (Exception e) {
                Thread.currentThread().interrupt(); //it will store the error and we can use if else below to do something about the exception
        }
    }
}


//        if (balance>=amount){
//            System.out.println(Thread.currentThread().getName() + " processing withdrawal " + amount);
//            try {
//            Thread.sleep(10000);
//            }catch (InterruptedException e){
//
//            }
//            balance = balance-amount;
//            System.out.println(Thread.currentThread().getName() + " withdrawal complete, remaining balance: " + balance);
//        }else {
//            System.out.println(Thread.currentThread().getName() + " insufficient balance");
//        }



