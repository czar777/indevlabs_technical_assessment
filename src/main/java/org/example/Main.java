package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int[] arr2 = {5, 0, 1, 3, 2};
        int[] arr3 = {7, 9, 10, 11, 12};
        System.out.println(findFirstMissingNumber(arr1));
        System.out.println(findFirstMissingNumber(arr2));
        System.out.println(findFirstMissingNumber(arr3));
    }

    public static int findFirstMissingNumber(int[] arr) {

        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            set.add(j);
        }

        int missingNumber = -1;
        for (int i = min; i <= min + arr.length; i++) {
            if (!set.contains(i)) {
                missingNumber = i;
                break;
            }
        }

        return missingNumber;
    }
}