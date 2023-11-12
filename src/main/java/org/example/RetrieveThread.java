package org.example;

import static java.lang.Thread.sleep;

public class RetrieveThread implements Runnable{
    private final ISigningService signingService;
    private final Topic topic;

    public RetrieveThread(ISigningService signingService, Topic topic) {
        this.signingService = signingService;
        this.topic = topic;
    }

    public void run() {
        while(true) {
            signingService.signing(topic);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
