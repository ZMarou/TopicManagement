package org.example;

import static java.lang.Thread.sleep;

public class DepositThread implements Runnable {
    private final ICheckoutService checkoutService;
    private final Topic topic;

    public DepositThread(ICheckoutService checkoutService, Topic topic) {
        this.checkoutService = checkoutService;
        this.topic = topic;
    }

    public void run() {
        int i = 0;
        while (i < 1000) {
            i++;
            Request request = new Request("name (" + i + ")", "iban : " + i);
            checkoutService.checkout(request, topic);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
