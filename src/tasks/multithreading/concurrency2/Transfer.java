package tasks.multithreading.concurrency2;

import tasks.multithreading.concurrency1.Account;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Transfer implements Callable<Boolean> {
    private Account accountFrom;
    private Account accountTo;
    private int amount;

    public Transfer(Account accountFrom, Account accountTo, int amount) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
    }

    @Override
    public Boolean call() throws Exception {
        if (accountFrom.getBalance() < amount) throw new Exception();
        if (accountFrom.getLock().tryLock(3, TimeUnit.SECONDS)){
            try {
                if (accountTo.getLock().tryLock(3,TimeUnit.SECONDS)){
                    accountFrom.withdraw(amount);
                    accountTo.desposit(amount);
                    return true;
                }else {
                    accountTo.incFailedTrasferCount();
                    return false;
                }
            }finally {
                accountFrom.getLock().unlock();
            }
        }else {
            accountFrom.incFailedTrasferCount();
            return false;
        }
    }
}
