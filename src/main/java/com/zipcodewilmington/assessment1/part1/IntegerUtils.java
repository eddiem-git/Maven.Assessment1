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
        for (int currentNumber = 0; currentNumber <= n; currentNumber++) {
            sum += currentNumber;
        }
        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `num`
     */
    public static Integer getProductOfN(Integer n) {
        int product = 1;
        for (int currentNumber = 1; currentNumber <= n; currentNumber++) {
            product *= currentNumber;
        }
        return product;
    }

    /**
     * @param num integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer num) {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
}
