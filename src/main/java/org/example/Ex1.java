package org.example;
import java.util.Random;
//
//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
public class Ex1 {
    public static void main(String[] args) {
        Random random = new Random();

        int i = random.nextInt(201);
        System.out.println(i);

    }
}