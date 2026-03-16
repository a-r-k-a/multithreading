package synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 200;

    private final Lock lock = new ReentrantLock();

    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() +  " attempting to withdraw...");
        if (balance > amount) {
            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
            balance -= amount;
            System.out.println("Withdrawal successful: " + Thread.currentThread().getName() + " remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient back balance...");
        }
    }
    
}
