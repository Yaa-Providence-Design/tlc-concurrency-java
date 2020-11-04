package com.company;
import java.util.concurrent.*;

public class ExecutorThread {
        public static void main(String[] args) {
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<?> future = executor.submit(() -> {
                print("Hello");
                print("Goodbye");
            });
            try {
                Thread.sleep(5_000);
                executor.shutdownNow();
                executor.awaitTermination(3,TimeUnit.SECONDS);
            } catch (InterruptedException ignore){}
        }
        static void print(String message) {
            try {
                for (int i=0; i<5; ++i) {
                    System.out.println(message);
                    Thread.sleep(1_000);
                }
            } catch (InterruptedException ignore){ }
        }
    }

