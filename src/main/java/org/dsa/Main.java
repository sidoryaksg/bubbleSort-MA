package org.dsa;

import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Integer[] items = {3, 1, 2};
        System.out.println(Arrays.toString(items));
        sort(items, Integer::compare);
        System.out.println(Arrays.toString(items));

        Month[] months = new Month[]{
                Month.APRIL,
                Month.JANUARY,
                Month.DECEMBER,
                Month.APRIL
        };
        System.out.println(Arrays.toString(months));

        sort(months, Comparator.comparingInt(Enum::ordinal));

        System.out.println(Arrays.toString(months));

        sort(months, Comparator.comparing(Enum::name));

        System.out.println(Arrays.toString(months));
    }
    public static <T> void sort(T[] items, Comparator<T> alg) {
        var n = items.length;
        for (var i = 0; i < n - 1; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (alg.compare(items[j], items[j + 1]) > 0) {
                    var temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }
}