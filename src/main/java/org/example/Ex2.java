package org.example;

//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

public class Ex2 {
    public static int significantBit(int i) {
        int binLen = Integer.toBinaryString(i).length();
        return binLen;

    }
}