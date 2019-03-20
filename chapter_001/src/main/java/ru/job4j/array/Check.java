package ru.job4j.array;
/**
 *Проверка того, что все элементы в массиве true или false
 **/

public class Check {
    /**
     * Массив состоит из true, false.
     * @param array массив из true/false.
     * @return boolean.
     */
    public boolean trueOrFalse(boolean[] array){
        boolean result = true;
        for (int i = 0; i < array.length-1; i++){
            if (array[i] != array[i+1]){
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Check check = new Check();
        boolean[] arr = {true, true, true, false};
        boolean res = check.trueOrFalse(arr);
        System.out.println(res);
    }

}
