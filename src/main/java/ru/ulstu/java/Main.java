package ru.ulstu.java;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        System.out.format("Hello form %s ", Thread.currentThread().getName());
        //запуск инструкций в новом потоке
        //new Thread(new SimpleTask()).start();
        
        //или запуск инструкций в новом потоке
        Thread simpleThread = new Thread (new SimpleTask());
        simpleThread.start();
        
        // не запустит новый поток!
        //simpleTghread.run();

        try {
            //если добавить вызов метода, то поток main будет ждать завершения
            simpleThread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
