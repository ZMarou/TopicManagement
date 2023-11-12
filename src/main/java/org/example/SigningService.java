package org.example;

public class SigningService implements ISigningService{
    @Override
    public void signing(Topic topic) {
        System.out.println("Call signing method");
        Request request = topic.poll();
        if(request != null)
            System.out.println(request.toString().concat( " is treated"));
    }
}
