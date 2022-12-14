package com.stackqueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Implementation of Stack & Queue using Linked List!");
        Stack s = new Stack();
        s.push(70);
        s.push(30);
        s.push(56);
        s.showStack();
        while (!s.isEmpty()) {
            // s.peek();
            s.pop();
        }
        Queue q = new Queue();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        logger.info("Queue implementation");
        while (!q.isEmpty()) {
            q.dequeue();
        }
    }
}
