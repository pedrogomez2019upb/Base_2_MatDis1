package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int generateNewBase(int num) {
        //BigInteger sumatory;
        int sumatory=0;
        List<Integer> baseNew= new ArrayList<Integer>();
        // Let's show the first number
        baseNew.add(num);
        for (int i = 1; i < num; i++) {

            int result = (int) Math.pow(num, i);
            baseNew.add(result);
        }
        return sumatory;

    }

    public static void main(String[] args) {

    }
}
