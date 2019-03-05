package ru.job4j.loop;
/**
 * Sum of even numbers
 * @author MPestereva
 * @version $Id$
 * @since 0.1
 */

public class Counter {
    /**
     * Counter.
     *
     */
    /**
     * Method add -sum of even numbers.
     * @param start  - first number.
     * @param finish - last number.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i=start; i<=finish; i++ ){
            if (i%2==0){sum=sum+i;}
        }
        return sum;
    }

    public static void main(String[] args) {
        Counter sum = new Counter();
        int evenSum = sum.add(0,4);
        System.out.println(evenSum);
    }
}
