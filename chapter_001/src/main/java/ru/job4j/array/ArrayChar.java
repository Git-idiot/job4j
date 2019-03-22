package ru.job4j.array;

public class ArrayChar {



    /**
     * Метод возвращает true, если сторка начинается с заданного префикса.
     * @param line заданная строка.
     * @param prefix префикс, с которого начинается строка
     * @return true/false.
     */

    public boolean startWith(String line, String prefix){
        char[] lineArray = line.toCharArray();
        char[] prefixArray = prefix.toCharArray();

        boolean result = true;
        for (int i = 0; i < prefixArray.length; i++)
        {
                if (prefixArray[i] != lineArray[i])
                {
                    result = false;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayChar check = new ArrayChar();
        String line = "Привет";
        String prefix = "По";
        boolean res = check.startWith(line, prefix);
        System.out.println(res);


    }
}
