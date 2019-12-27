package com.zipcodewilmington.assessment1.part1;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {

        return stringArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        return stringArray[1];
    }

    /**
     * @param stringArray an array of String objects
     * @return the last element in the array
     */
    public static String getLastElement(String[] stringArray) {
        Integer lastIndex = stringArray.length-1;
        String lastElement = stringArray[lastIndex];
        return lastElement;

    }

    /**
     * @param stringArray an array of String objects
     * @return the second to last element in the array
     */
    public static String getSecondToLastElement(String[] stringArray) {
       Integer second2LastIndex = stringArray.length-2;
       String second2LastElement = stringArray[second2LastIndex];
        return second2LastElement;
    }
}
