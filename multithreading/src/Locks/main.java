package Locks;

public class main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                b.withdrawl(50);
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();

        t2.start();

    }
}
