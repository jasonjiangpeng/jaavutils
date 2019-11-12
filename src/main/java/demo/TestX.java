package demo;

import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestX  {
    String  sd;

    public String getSd() {
        return sd;
    }
    public void setSd(String sd) {
        this.sd = sd;
    }
    int   a=0;
    public void dosomeing(){
        Lock lock=new ReentrantLock();
        lock.lock();
         if (a<20){

             try {
                 System.out.println(a+"-----"+Thread.currentThread().getName());
                 a++;

                 dosomeing();
               //  Thread.sleep(100);
             } catch (Exception e) {
                 e.printStackTrace();
             }finally {
                 lock.unlock();
                 System.out.println("我走了"+Thread.currentThread().getName());
             }
         }
    }
}
