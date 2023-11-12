package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Topic {

    private final Queue<Request> queue ;

    public Topic() {
        queue = new LinkedList<>();
    }

    public void add(Request request) {
        queue.add(request);
    }

    public Request poll() {
        return queue.poll();
    }
}
