package jason.boot.test;

import sun.nio.ch.ThreadPool;

import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Nsort {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    public static void main(String[] args) {
        ByteBuffer allocate = ByteBuffer.allocate(10);
        byte[]  bytes =new byte[4];
        for (int i = 0; i <bytes.length ; i++) {
            bytes[i]= (byte) i;
        }
  allocate.put(bytes);
 
        byte[] array = allocate.array();
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    public  synchronized void insert(Thread thread) {
        Lock lock = new ReentrantLock();    //注意这个地方
        lock.lock();
        try {
            System.out.println(thread.getName()+"得到了锁");
            for(int i=0;i<5;i++) {
                arrayList.add(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }finally {
            System.out.println(thread.getName()+"释放了锁");
            lock.unlock();
        }
    }
}
