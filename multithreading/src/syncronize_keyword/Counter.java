package syncronize_keyword;

public class Counter{
    private int count = 0;
    public synchronized void increment(){  //The synchronized keyword in Java is used to prevent multiple threads from accessing a block of code or method simultaneously, which could lead to inconsistent or incorrect behavior. When a method is marked as synchronized, only one thread can execute it at a time for a given object. This ensures thread safety when multiple threads try to access shared resources.
        count++;
    }

    /*
    {
    synchronized(this){
        count++ // for sync block for a specific part of code we use sync block
    }
    */

    public int getCount(){
        return count;
    }
}