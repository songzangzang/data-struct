package com.test.sorting;


import java.util.Arrays;

/**
 * 插入排序
 *
 * @author songxibo
 */
public class InsertingSort {

    /**
     * 使用插入排序对15个数进行排序
     */
    public static void sortNumber(Integer[] array) {

        int number1;

        for (int i = 0; i < array.length; i++) {

            if (i == 0) {

                continue;

            }

            for (int j = i - 1; j < i; j--) {

                if (array[i] < array[j]) {

                    number1 = array[j];
                    array[j] = array[i];
                    array[i] = number1;

                    --i;

                } else {

                    break;

                }

            }

        }

    }

    public static void main(String[] args) {

        Integer[] array = new Integer[]{1, 3, 5, 7, 2, 8, 10, 15, 13, 11, 12, 4, 6, 9, 14};

        InsertingSort.sortNumber(array);

        Arrays.stream(array).forEach(number -> System.out.println(number));

    }

}
