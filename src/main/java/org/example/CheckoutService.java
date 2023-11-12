package org.example;

public class CheckoutService implements  ICheckoutService{

    public void checkout(Request request, Topic topic) {
        System.out.println("Call checkout method");
        topic.add(request);
    }
}
