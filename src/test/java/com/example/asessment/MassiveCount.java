package com.example.asessment;

import java.util.stream.IntStream;

public class MassiveCount {
    public static void main(String[] args) {
        int[] mas1 = IntStream.rangeClosed(1, 20).toArray();
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] % 3 == 0 && mas1[i] % 5 == 0) {
                System.out.println("Fizz-Buzz");
            } else if (mas1[i] % 3 == 0) {
                System.out.println("Fizz");
            } else if (mas1[i] % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(mas1[i]);
            }
        }
    }

}
