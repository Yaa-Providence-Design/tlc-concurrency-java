package com.company;

public class CancelledWithInterrupt {
        public static void main(String[] args) throws InterruptedException {
            System.out.println("Main thread 1");
            Thread hello = new Thread(() -> {
            while (true) {
                System.out.println("Hello World go away");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        hello.start();
        Thread.sleep(5000);
        hello.interrupt();
        System.out.println("Main Thread 2");
    }
}
