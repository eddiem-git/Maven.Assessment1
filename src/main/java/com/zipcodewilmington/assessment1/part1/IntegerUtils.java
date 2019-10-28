package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += n - i;
        }

        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {

        int product = 1;
        for (int number = 1; number <= n; number++) {
            product *= number;

        }return product;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {

        int reversed = 0;
        for (; val != 0; val /= 10) {
            int digit = val % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;

    }
}
