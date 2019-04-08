package ru.job4j.array;
/**
 * @author MPestereva (matveevamb@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class BubbleSort {
    public int[] sort(int[] data) {
        int x = 0;
        while (x < data.length) {
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    int tmp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = tmp;

                }
            }
            x = x + 1;
        }
        return data;
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] array = {5, 4, 7, 0, 1, 9, 55, 2, 100, 3};
        int[] sorted = sort.sort(array);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }
}
