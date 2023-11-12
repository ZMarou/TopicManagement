package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Topic topic= new Topic();
        DepositThread depositThread = new DepositThread(new CheckoutService(), topic);
        Thread producer = new Thread(depositThread);
        producer.start();
        RetrieveThread retrieveThread = new RetrieveThread(new SigningService(), topic);
        Thread consumer = new Thread(retrieveThread);
        consumer.start();
    }
}
