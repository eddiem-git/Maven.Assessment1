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
        Integer result = 0;
        for (int currentIndex = 0; currentIndex < intArray.length; currentIndex++) {
            result += intArray[currentIndex];
        }
        return result;
    }
    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer result = 1;
        for (int currentIndex = 0; currentIndex < intArray.length; currentIndex++) {
            result *= intArray[currentIndex];
        }
       return result;
    }
        /**
         * @param intArray an array of integers
         * @return the sum of `intArray` divided by number of elements in `intArray`
         */
    public static Double getAverage(Integer[] intArray) {
        double total = 0;
        for(int currentPosition = 0; currentPosition<intArray.length; currentPosition++){
            total = total + intArray[currentPosition];
        }
        double average = total / intArray.length;
        return average;
    }
}
