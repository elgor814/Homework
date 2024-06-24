package org.example;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int a = 12 ; // число, факториал которого нужно вычислить
        BigInteger factorial = BigInteger.valueOf(1);
        int i;
        for (i = 1; i <= a; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));

        }
        System.out.println(" Факториал числа " + a + " равен " + factorial);
    }

}