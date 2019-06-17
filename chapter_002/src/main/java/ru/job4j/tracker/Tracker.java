package ru.job4j.tracker;
import java.util.*;

/**
 * Tracker заявок
 **/

public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;
    private static final Random RN = new Random();

    /**
     * Добавление заявки.
     *
     * @param item заявка (имя, описание, дата создания).
     * @return item.
     */

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Генерация уникального идентификатора заявки.
     *
     * @return rand.
     */

    private String generateId() {
        String rand = String.valueOf(RN.nextInt() * 10);
        return rand;
    }

    /**
     * Method size. Получить размер стека заявок.
     */
    public int size() {
        return this.position;
    }

    /**
     * Замена заявки.
     *
     * @param id      идентификатор заявки, подлежащей замене.
     * @param newItem новая заявка (имя, описание, дата)
     * @return isReplaceSuccess true - замена заявки прошла успешно, false - заявка не заменилась
     */

    public boolean replace(String id, Item newItem) {
        System.out.println("replace=" + id + " newItem=" + newItem);
        boolean isReplaceSuccess = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getId().equals(id)) {
                items[i].setName(newItem.getName());
                items[i].setDecs(newItem.getDecs());
                items[i].setTime(newItem.getTime());
                isReplaceSuccess = true;
                break;
            }
        }

        return isReplaceSuccess;
    }

    /**
     * Удаление заявки.
     *
     * @param id идентификатор удаляемой заявки.
     * @return isDeleted true - удаление заявки прошло успешно, false - заявка не удалилась
     */


    public boolean delete(String id) {
        //System.out.println("Position before deleting - " + this.position);
        boolean isDeleted = false;
        if (this.position > 0){
            int pos = this.getPositionById(id);
            System.arraycopy(items, pos + 1, items, pos, this.position - pos);
            this.position--;
            isDeleted = true;
        }

        //System.out.println("Position after - " + this.position);

        return isDeleted;
    }

    /**
     * Вывод всех заявок
     *
     * @return result - все заявки
     */

    public Item[] findAll() {
        Item[] result;
        int count = 0;
        for (int i = 0; i < this.position; i++) {
            if (items[i] != null) {
                count++;
            }

        }
        result = new Item[count];
        //System.out.println(Arrays.asList(items));
        for (int i = 0; i < count; i++) {
            if (items[i] != null) {
                result[i] = items[i];
            }

        }
        return result;
    }

    /**
     * Поиск заявки по имени.
     *
     * @param key имя заявки.
     * @return result - заявка
     */


    public Item[] findByName(String key) {
        Item[] result;
        int count = 0;
        for (int i = 0; i < this.position; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                count++;
            }

        }
        result = new Item[count];
        System.out.println(Arrays.asList(items));
        for (int i = 0; i < count; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                result[i] = items[i];
            }

        }
        return result;
    }


    /**
     * Поиск заявки по идентификатору.
     *
     * @param id идентификатор заявки.
     * @return result - найденная заявка
     */

    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }

        }
        return result;
    }

    /**
     * Получение позиции (не id) заявки в массиве заявок по идентификатору заявки.
     *
     * @param id идентификатор заявки.
     * @return result - позиция заявки в массиве
     */

    public int getPositionById(String id) {
        int result = -1;
        for (int i = 0; i < this.position; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                result = i;
                break;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("Name1", "Desc1", created);
        //Item item2 = new Item("Name2", "Desc2", created);
        //Item itemR = new Item("Name3", "Desc3", created);
        Item result = tracker.add(item);
        //Item result2 = tracker.add(item2);
        //Item result3 = tracker.add(itemR);

        boolean deleted = tracker.delete(item.getId());
        System.out.println(deleted);
        //System.out.println(position);
        System.out.println(tracker.size());

    }
}
