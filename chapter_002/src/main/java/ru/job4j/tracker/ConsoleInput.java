package ru.job4j.tracker;
import java.util.*;
import java.util.Scanner;

public class ConsoleInput implements Input {
    public String ask(String question) {
        System.out.println(question);
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        return answer;

    }

    @Override
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }

        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Значение вне диапазона");
        }
    }

    /*   private static final String ADD = "0";
    public String ask () {

        System.out.println("Введите пункт меню");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        return answer;
    }*/

/*    public static void main(String[] args) {
        ConsoleInput c = new ConsoleInput();
        String r = c.ask("Введите имя");
        System.out.println(r);
        //if (ADD.equals(r)){System.out.println("Hurray!!!");

        }*/

}




