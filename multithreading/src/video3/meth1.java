package video3;

import  java.lang.Thread;
class base1 extends Thread{
    public void run(){
        while (true){
            System.out.println("world");
        }
    }
}

public class meth1 {
    public static void main(String[] args) {
        base1 s = new base1();  // this our thraid
        s.start();
        while (true){
            System.out.println("hello"); // this is main thread
        }
    }
}
