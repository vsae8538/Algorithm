import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    boolean static lock;
    boolean static lock2;
    public Foo() {
        this.lock = false;
        this.lock2 = false;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        synchronized(this){
            printFirst.run();
            lock = true;
            notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
      synchronized(this){
            while(lock == false)
                wait();
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            lock2 = true;
            notifyAll();
      }
    }

    public void third(Runnable printThird) throws InterruptedException {
       synchronized(this){
            while(lock2 == false)
                wait();
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            notifyAll();
       }
    }
}
