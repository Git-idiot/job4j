package ru.job4j.tracker;

public class StubInput implements Input {
    private String[] answers;
    private int position = 0;
    /**
     * Method StubInput. Конструктор.
     * @param answers Ответы.
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }
    /**
     * Method ask. Получение ответа на вопрос.
     * @param question Вопрос.
     * @return Ответ
     */
    public String ask(String question) {
        return answers[this.position++];
    }
    /**
     * Method ask. Получение ответа на вопрос.
     * @param question Вопрос.
     * @param range Допустимый диапазон вопросов.
     * @return Ответ
     */
    public int ask(String question, int[] range) {
        int res = -1;
        if (this.answers.length > this.position) {
            res = Integer.parseInt(answers[this.position++]);
            res = MenuTracker.checkKeyInAvailableRangeList(res, range);
        }
        return res;
    }
}