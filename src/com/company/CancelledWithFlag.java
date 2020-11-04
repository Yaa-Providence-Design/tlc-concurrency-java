package com.company;

public class CancelledWithFlag {
    public static volatile boolean isRunning = true;
    public static void main(String[] args) throws InterruptedException {
        Thread hello = new Thread(() -> {
            while (isRunning) {
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
        isRunning = false;
        System.out.println("Set is Running to " + isRunning);
    }
}
