package ru.job4j.loop;
/**
 * Factorial
 * @author MPestereva
 * @version $Id$
 * @since 0.1
 */

public class Factorial {
    /**
     * Method calc -calculate factorial.
     * @param n  - n!.
     */
    public int calc(int n) {
        int result = 1;
        for (int i=1; i<=n; i++){
            result=result*i;
        }
        return result;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int f= factorial.calc(3);
        System.out.println(f);
    }
}
