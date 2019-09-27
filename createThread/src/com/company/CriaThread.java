package com.company;

public class CriaThread implements Runnable {
    private int threadNum;

    public CriaThread(int i) {
        this.threadNum = i;
    }

    @Override
    public void run() {
        for(int i = 1;i <= 50;i++){
            System.out.println("Executando Thread "+threadNum+" pela "+i+" vez");
        }
    }
}
