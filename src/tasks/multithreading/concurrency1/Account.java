package tasks.multithreading.concurrency1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private  int balance;
    private Lock lock;
    private AtomicInteger failCounter = new AtomicInteger();

    public Account(int balance) {
        this.balance = balance;
        this.lock = new ReentrantLock();
    }

    public void withdraw(int amount){
        balance -= amount;
    }
    public  void  desposit(int amount){
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public Lock getLock() {
        return lock;
    }

    public void incFailedTrasferCount(){
        failCounter.incrementAndGet();
    }

    public int getFailCounter() {
        return failCounter.get();
    }
}
