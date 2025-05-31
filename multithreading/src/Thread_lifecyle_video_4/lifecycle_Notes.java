package Thread_lifecyle_video_4;


public class lifecycle_Notes extends Thread{
    public void run(){
        System.out.println("RUNNING");
        try {
            Thread.sleep(600);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
    lifecycle_Notes t1 = new lifecycle_Notes();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
}
