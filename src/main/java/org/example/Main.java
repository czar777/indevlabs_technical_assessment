package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Сценарий при котором один пропущенный элемент
        int[] arr1 = {1, 2, 3, 5};
        System.out.println(findFirstMissingNumber(arr1));

        //Сценарий при котором один пропущенный элемент
        int[] arr2 = {5, 0, 1, 3, 2};
        System.out.println(findFirstMissingNumber(arr2));

        //Сценарий при котором один пропущенный элемент
        int[] arr3 = {7, 9, 10, 11, 12};
        System.out.println(findFirstMissingNumber(arr3));

        //Сценарий при котором нет пропущенных элементов
        int[] arr4 = {0, 1};
        System.out.println(findFirstMissingNumber(arr4));

        //Сценарий при котором все элементы одинаковые
        int[] arr5 = {0, 0};
        System.out.println(findFirstMissingNumber(arr5));

        //Сценарий при котором 2 пропущенных элемента
        int[] arr6 = {5, 2, 1, 0};
        System.out.println(findFirstMissingNumber(arr6));
    }

    // Time complexity: O(n)
    // Space complexity: O(n)
    public static int findFirstMissingNumber(int[] arr) {

        // Если пустой или массив с одним элементом
        if (arr.length <= 1) {
            return -1;
        }

        // Находим минимальный элемент. Это будет у нас началом последовательности
        int min = Integer.MAX_VALUE;
        // Создаем множество, для того делать быстрый поиск на отсутствующие элементы
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            set.add(j);
        }

        // Если элемент не найден, то будет возвращаться -1
        int missingNumber = -1;
        for (int i = min; i < min + set.size(); i++) {
            // Если элемента нет в множестве, то возвращаем его и выходим из цикла
            if (!set.contains(i)) {
                missingNumber = i;
                break;
            }
        }

        return missingNumber;
    }
}