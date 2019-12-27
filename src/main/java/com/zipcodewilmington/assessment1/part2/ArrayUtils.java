package com.zipcodewilmington.assessment1.part2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

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
        Integer count = 0;
        for (int currentIndex = 0; currentIndex < objectArray.length; currentIndex++) {
            Object currentElement = objectArray[currentIndex];
            if(objectToCount == currentElement){
                count++;
            }
        }
        return count;
    }

    /**
     * @param inputArray     an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] inputArray, Object objectToRemove) {
        ArrayList<Object> newList = new ArrayList<>();
        for (int currentIndex = 0; currentIndex < inputArray.length; currentIndex++) {
            Object currentElement = inputArray[currentIndex];
            if(currentElement != objectToRemove){
                newList.add(currentElement);
            }
        }
        return newList.toArray();
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object mostCommon = 0;
        for (int currentIndex = 0; currentIndex < objectArray.length-1; currentIndex++) {
            Object currentElement = objectArray[currentIndex];
            if(currentElement != objectArray[currentIndex+1]){
                mostCommon = objectArray[currentIndex];
            }
        }
        return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }


    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        ArrayList<Object> myList = new ArrayList<>();
        myList.add(objectArray);
        myList.add(objectArrayToAdd);
        return myList.toArray(new Object[myList.size()]);
    }
}
