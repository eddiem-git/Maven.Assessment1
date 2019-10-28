package com.zipcodewilmington.assessment1.part1;
import java.util.Arrays;
import java.util.stream.*;
/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {

        int sum = 0;

        for (int i : intArray) {
            sum += i;
        }return sum;
    }
    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int n = intArray.length;

        int result = 1;
        for (int i = 0; i < n; i++)
            result = result * intArray[i];
        return result;
    }
        /**
         * @param intArray an array of integers
         * @return the sum of `intArray` divided by number of elements in `intArray`
         */
    public static Double getAverage(Integer[] intArray) {
            Double Arraylength = (double) getSum(intArray) / intArray.length;
             return Arraylength;
    }
}
