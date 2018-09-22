package com.company;

public class Main {

    public static void main(String[] args) {
        for (int n=2; n<10; n++){
            for (int a=1; a<100; a++) {
                for (int b=1; b<100; b++) {
                    for (int c=1; c<100; c++) {
                        if (Math.pow(a,n)+ Math.pow(b,n)== Math.pow(c,n)) {
                            System.out.println("n = " + n + ", " + (long)Math.pow(a, n) +" + " + (long)Math.pow(b, n)
                                    +" = "+ (long)Math.pow(c, n));
                        }
                    }
                }
            }
        }
       double positive = 0;
       double negative = 0;
       double result;
       for (int i=1; i<=10000; i++) {
            if (i%2 == 0) {
                negative += 1.0/i;
            }else {
                positive += 1.0/i;
            }
       }
       result = positive - negative;
        System.out.println("Second task \nResult: " + result);
    }
}