package ru.job4j.array;

public class Turn {
    public int[] turnArray (int[] array) {
        //int tmp = -1;
        int last = array.length-1;
        for (int i = 0; i < array.length/2; i++){
//            int tmp = array[i];
//            array[i] = array[array.length-1];
//            array[array.length-1] = tmp;
            //int last = array.length;
            int tmp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = tmp;
            //last--;
            //System.out.println(array[i]);

        }
        return array;
    }
    public static void main(String[] args) {
        Turn turn = new Turn();
        int[] ar = {0,1,2,3};
        int[] array = turn.turnArray(ar);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
