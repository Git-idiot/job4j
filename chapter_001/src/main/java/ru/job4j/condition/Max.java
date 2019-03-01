package ru.job4j.condition;
/**
 * @author MPestereva (matveevamb@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class Max {
    /**
     * Ищет максимум двух чисел.
     * @param left Первое число.
     * @param right Второе число.
     * @return Максимум.
     */
    public int max(int left, int right) {
        return left-right>0 ? left : right;

    }

    public static void main(String[] args) {
        Max max = new Max ();
        int res=max.max(0,0);
        System.out.println(res);

    }
}