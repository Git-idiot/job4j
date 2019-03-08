package ru.job4j.calculator;
/**
 * Simple calculator
 * @author MPestereva

 */

public class Calculator {
    /**
     * Calculator.
     *
     */
    public double result;
    /**
     * Method add -addition.
     * @param first  - first number.
     * @param second - second number.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Method subtract -subtraction.
     * @param first- first number.
     * @param second - second number.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    /**
     * Method div - division.
     * @param first - first number.
     * @param second - second number.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     * Method multiple - multiplication.
     * @param first - first number.
     * @param second - second number.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method getResult.
     * @return result
     */
    public double getResult() {
        return this.result;
    }
    /**
    public static void main(String[] args) {
        Calculator Calc = new Calculator();
        double res;
        Calc.div(1,2);
        res=Calc.getResult();
        System.out.println(res);
    }
     */

}