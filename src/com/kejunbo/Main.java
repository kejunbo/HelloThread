package com.kejunbo;

public class Main extends Thread {
    @Override
    public void run(){
        System.out.println("T01" + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(500);
        Thread t1 = new Thread(){
            public void run() {
                for (int i = 1; i <= 9; i++){
                    if (i % 2 == 0) {
                        System.out.println("odd thread" + i);
                    }
                }
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                for (int i = 1; i <= 9; i++){
                    if (i % 2 != 0) {
                        System.out.println("even thread" + i);
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
