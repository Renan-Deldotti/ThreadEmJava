package com.company;

public class Main {

    public static void main(String[] args) {
        CriaThread a,b,c;
        Thread thread1,thread2,thread3;

        a = new CriaThread(1);
        b = new CriaThread(2);
        c = new CriaThread(3);

        thread1 = new Thread(a);
        thread2 = new Thread(b);
        thread3 = new Thread(c);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
