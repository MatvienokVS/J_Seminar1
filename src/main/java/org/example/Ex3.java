package org.example;
import java.util.ArrayList;

public class Ex3 {
    public static ArrayList<Integer> arrayNotMult(int i, int n, int min) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //for (int j = i + 1; j <= max; ++j) {
        //if (j % n == 0) {
        for (int j = i - 1; j >= min; j--) {
            if (j % n != 0) {
                list.add(j);
            }
        }
        return list;
    }
}
