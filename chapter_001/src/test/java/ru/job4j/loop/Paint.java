package ru.job4j.loop;

/**
 * Class Board решение задач Части 001. Базовый синтаксис урок 5.
 *
 * @author MPestereva
 * @since 09.03.2019
 * @version 1
 */
public class Paint {

    /**
     * Method piramid. Отрисовка пирамиды заданной высоты.
     * @param height Высота пирамиды.
     * @return Псевдографика пирамиды.
     */
    public String piramid(int height) {
        StringBuilder result = new StringBuilder();
        String ln = System.lineSeparator();
        int bottom = (height - 1) * 2 + 1;
        int width = 0;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= bottom; j++) {
                if ((j >= height - width) && (j <= height + width)) {
                    result.append("^");
                } else {
                    result.append(" ");
                }
            }
            width++;
            result.append(ln);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Paint piramid = new Paint();
        String p = piramid.piramid(2);
        System.out.println(p);
    }
}