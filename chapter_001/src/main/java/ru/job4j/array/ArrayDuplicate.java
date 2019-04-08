package ru.job4j.array;
import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array){
        int n = 1;
        for(int i = 0; i < array.length-n; i++){
            //int n = 0;
            for(int j = 1; j < array.length-n; j++){
                if(array[i].equals(array[j])){
                String tmp = array[array.length-i-1];
                array[array.length-i-1] = array[j];
                array[j] = tmp;
                n++;
                }
                //System.out.println(n);
            }
            //System.out.println(n);
         }
       System.out.println(n);
        String[] removedCopy = Arrays.copyOf(array, array.length-(n-1));
        return removedCopy; //array;

    }
    public static void main(String[] args) {
        ArrayDuplicate dupl = new ArrayDuplicate();
        String[] ar = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] array = dupl.remove(ar);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
