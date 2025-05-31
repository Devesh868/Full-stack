package Thread_lifecyle_video_4;

import  java.lang.Thread;
class base2 extends Thread{
    public void run(){
        while (true){
            System.out.println("world");
        }
    }
}

public class lifecycle {
    public static void main(String[] args) {
        base2 s = new base2();  //this is new state
        s.start(); // this is runnable state
        while (true){ // this is runnnig state
            System.out.println("hello"); // this is main thread
        }

        //finished executing is terminated state
    }
}
