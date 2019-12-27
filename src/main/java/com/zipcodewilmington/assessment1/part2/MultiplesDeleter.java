package com.zipcodewilmington.assessment1.part2;

import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param input array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] input) {
        List<Integer> newList = new ArrayList<>();
        for( int currentIndex = 0; currentIndex < input.length; currentIndex++){
            Integer currentElement = input[currentIndex];
            if(currentElement % 2 != 0){
                newList.add(currentElement);
            }else{
                newList.remove(currentElement);
            }
        }

        return newList.toArray(new Integer[newList.size()]);
    }


    /**
     * @param input array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `input` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] input) {
        List<Integer> newList = new ArrayList<>();
        for( int currentIndex = 0; currentIndex < input.length; currentIndex++){
            Integer currentElement = input[currentIndex];
            if(currentElement % 2 == 0){
                newList.add(currentElement);
            }else{
                newList.remove(currentElement);
            }
        }

        return newList.toArray(new Integer[newList.size()]);
    }


    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] input) {
        List<Integer> newList = new ArrayList<>();
        for( int currentIndex = 0; currentIndex < input.length; currentIndex++){
            Integer currentElement = input[currentIndex];
            if(currentElement % 3 != 0){
                newList.add(currentElement);
            }else{
                newList.remove(currentElement);
            }
        }

        return newList.toArray(new Integer[newList.size()]);
    }

    /**
     * @param ints     array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers
     * indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] input, int multiple) {
        List<Integer> newList = new ArrayList<>();
        for( int currentIndex = 0; currentIndex < input.length; currentIndex++){
            Integer currentElement = input[currentIndex];
            if(currentElement % multiple != 0){
                newList.add(currentElement);
            }else{
                newList.remove(currentElement);
            }
        }

        return newList.toArray(new Integer[newList.size()]);
    }
}
