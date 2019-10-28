package com.zipcodewilmington.assessment1.part2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter = 0;
        for (int i = 0; i <= objectArray.length - 1; i++) {
            if (objectArray[i].equals(objectToCount)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] inputArray, Object objectToRemove) {
        List<Object> list = new ArrayList<>();
        for (int currentIndex = 0; currentIndex < inputArray.length; currentIndex++) {
            Object currentElement = inputArray[currentIndex];

            // dont add value to remove
            if(!currentElement.equals(objectToRemove)) {
                list.add(currentElement);
            }
        }

        return list.toArray();
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object mostCommonElement = null;
        Integer mostAmountOfOccurrences = 0;
        for (int currentIndex = 0; currentIndex < objectArray.length; currentIndex++) {
            Object currentElement = objectArray[currentIndex];
            int numberOfOccurrences = getNumberOfOccurrences(objectArray, currentElement);
            if(numberOfOccurrences > mostAmountOfOccurrences) {
                mostAmountOfOccurrences = numberOfOccurrences;
                mostCommonElement = currentElement;
            }
        }
        return mostCommonElement;
    }



    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object leastCommonElement = null;
        Integer leastAmountOfOccurrences = 999999999;
        for (int currentIndex = 0; currentIndex < objectArray.length; currentIndex++) {
            Object currentElement = objectArray[currentIndex];
            int numberOfOccurrences = getNumberOfOccurrences(objectArray, currentElement);
            if(numberOfOccurrences <= leastAmountOfOccurrences) {
                leastAmountOfOccurrences = numberOfOccurrences;
                leastCommonElement = currentElement;
            }
        }
        return leastCommonElement;
    }


    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        List<Object> list = new ArrayList<>();

        for (int currentIndex = 0; currentIndex < objectArray.length; currentIndex++) {
            Object currentElement = objectArray[currentIndex];
            list.add(currentElement);
        }

        for (int currentIndex = 0; currentIndex < objectArrayToAdd.length; currentIndex++) {
            Object currentElement = objectArray[currentIndex];
            list.add(currentElement);
        }

        return list.toArray();
    }
}
