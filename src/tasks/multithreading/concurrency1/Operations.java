package tasks.multithreading.concurrency1;

import java.util.concurrent.TimeUnit;

public class Operations {
    public static void main(String[] args) {
        final Account a = new Account(1000);
        final Account b = new Account(2000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    transfer(a,b,500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        try {
            transfer(b,a,300);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void transfer(Account account1, Account account2, int amount) throws Exception {
        if (account1.getBalance() < amount) throw new Exception();
        if (account1.getLock().tryLock(3, TimeUnit.SECONDS)){
            try {
                if (account2.getLock().tryLock(3,TimeUnit.SECONDS)){
                    account1.withdraw(amount);
                    account2.desposit(amount);
                }else {account2.incFailedTrasferCount();}
                System.out.println("Tranfer finish");
            }finally {
                account1.getLock().unlock();
            }
        }else {
            account1.incFailedTrasferCount();
        }
    }
}
