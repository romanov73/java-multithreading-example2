package ru.ulstu.java;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleTask implements Runnable {

    @Override
    public void run() {
        System.out.format("Hello form %s ", Thread.currentThread().getName());

        double calc;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            calc = Math.sin(i * i);
            if (i % 10000 == 0) {
                System.out.println(Thread.currentThread().getName() + " counts " + i / 10000);
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SimpleTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
