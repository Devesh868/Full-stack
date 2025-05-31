package video3;

class t implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("hello");
        }
    }
}

public class math2_thread {
    public static void main(String[] args) {
        t s = new t();
        Thread s1 = new Thread(s); // class t uska object s use pass karege new thread banake
        s1.start();


        while (true){
            System.out.println("world");
        }
    }
}
