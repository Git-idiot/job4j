package ru.job4j.array;
/**
 * поиск элемента в массиве и вывод его номера
 **/
public class FindLoop {
    /**
     * Возводим в квадрат и заполняем массив.
     * @param data массив.
     * @param el искомый элемент
     * @return номер элемента массива.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        FindLoop findLoop = new FindLoop();
        int[] array = {5, 2, 1, 7, 9};
        int result = findLoop.indexOf(array, 3);
        System.out.println(result);
    }
}
