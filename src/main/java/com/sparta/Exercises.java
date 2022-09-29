package com.sparta;

import java.util.ArrayList;
import java.util.List;

public class Exercises {
    public static boolean myMethod(int num1, int num2) {
        return num1 == num2 ? false : (num1 % num2) == 0;
    }

    // change this method so that it uses the ternary operator ?
    public static String getForecast(int temp) {
        return (temp < 15) ? "It's cold" : "It's hot";

    }


    // implement this method so that it returns true if num is even, otherwise false
    public static boolean evenOdd(int num) {
        return (num % 2 == 0) ? true : false;
    }

    // implement this method so that it returns
    // the sum of all numbers between 1 and n inclusive
    // that are divisible by either 2 or 5

    public static int sumEvenFive(int n) {
        int sum = 0;
        //List<Integer> integers = new ArrayList<>();// 1 2 3 4 5 6 7 8 9
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 || i % 5 == 0) {
                sum += i;
                //integers.add(i);
            }

            //for (int i = 0; i < integers.size(); i++) {
            //if (integers.get(i) % 2 == 0 || integers.get(i) % 5 == 0) {
            // sum += integers.get(i);
        }
        return sum;
    }
}

