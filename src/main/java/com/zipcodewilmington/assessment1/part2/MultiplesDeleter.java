package com.zipcodewilmington.assessment1.part2;

import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.removeIf(number -> number % 2 == 0);
        Collections.sort(numbers);
        return null;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] input) {
        Integer n = input.length;
        Integer[] output = new Integer[n];
        for(int i : input ) {
            if(i%2 == 0)
                output[i] = input[i];
        }
        return output;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> multiple3 = new ArrayList<>();

        for (int i = 0; i < ints.length; i++) {
            if ((ints[i] % 3) == 0) {
                multiple3.remove(ints[i]);

            }
        }
        return null;
    }

    /**
     * @param ints     array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers
     * indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        return null;

    }
}