package com.charel;

/*
 * Your task is to make a function that can take any non-negative integer as a argument and
 * return it with its digits in descending order.
 * Essentially, rearrange the digits to create the highest possible number.
 *
 * Examples:
 * Input: 21445 Output: 54421
 * Input: 145263 Output: 654321
 * Input: 123456789 Output: 987654321
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {

    // My Solution
    public static int mySortDesc(final int num) {
        String tempString = Integer.toString(num);
        char[] ch = tempString.toCharArray();
        Integer[] numbers = new Integer[tempString.length()];

        for (int i = 0; i < tempString.length(); i++) {
            numbers[i] = Character.getNumericValue(ch[i]);
        }

        Arrays.sort(numbers, Collections.reverseOrder());

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            stringBuilder.append(numbers[i]);
        }

        int result = Integer.parseInt(stringBuilder.toString());

        return result;
    }

    // Best Solution
    public static int bestSortDesc(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }

}
