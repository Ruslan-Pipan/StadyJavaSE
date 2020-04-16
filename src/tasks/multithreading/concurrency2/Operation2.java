package tasks.multithreading.concurrency2;

import tasks.multithreading.concurrency1.Account;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Operation2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Account account1 = new Account(1000);
        Account account2 = new Account(10);

        Random random = new Random();
        for (int i =0; i <10; i++){
            service.submit(new Transfer(account1,account2,random.nextInt(400)));
            account1 = new Account(random.nextInt(1000));
            account2 = new Account(random.nextInt(1000));
            System.out.println(account1.getBalance());
        }
        service.shutdown();
        service.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
    }
}
