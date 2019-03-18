package ru.job4j.array;
/**
*заполняет массив числами, возведенными в квадрат
 **/
public class Square {
    /**
     * Возводим в квадрат и заполняем массив.
     * @param n кол-во элементов в массиве.
     * @return массив.
     */
    public int[] fillSquare(int n) {
//        int size;
//        if (n > 0) {
//            size = n;
//        } else {
//            size = 1;
//        }
//        System.out.println(size);

        int size = n <= 0 ? 1 : n;
        System.out.println(size);

        int[] arr = new int[size];
        if (n > 0) {
            for (int i = 0; i < size; i++) {
                arr[i] = (int) Math.pow(i, 2);
                System.out.println(arr[i]);
            }
        } else {
            arr[0] = 1;
           System.out.println(arr[0]);

    }
        return arr;
    }

    public static void main(String[] args) {
        Square arrSquare = new Square();
        int[] array = arrSquare.fillSquare(-1);
        System.out.println(array);
    }
}
