package ru.job4j.tracker;
import java.util.*;

import org.junit.Test;
import org.junit.Before;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    Tracker tracker;
    Item item;
    Item item2;
    Item newItem;
    Item newItem2;
    Item replacedItem;
    Item [] allItemsAdd;


    @Before
    public void before() {
        this.tracker = new Tracker();
        long created = System.currentTimeMillis();
        item = new Item("Name1", "Desc1", created);
        newItem = tracker.add(item);
        replacedItem = new Item("Name2", "Desc2", created);
        item2 = new Item("Name1", "Desc2", created);
        newItem2 = tracker.add(item2);
        allItemsAdd = new Item[2];
        allItemsAdd[0] = item;
        allItemsAdd[1] = item2;
    }

    /**
     * Проверка добавления элемента в трекер
     */

    @Test
    public void checkAdd(){
        Item[] byName = tracker.findByName("Name1");
        assertThat(byName[0], is(item));


    }
    /**
     * Проверка замены элемента в трекер
     */

    @Test
    public void checkReplace(){
        Boolean replaced = tracker.replace(newItem.getId(), replacedItem);
        Item findItem = tracker.findById(newItem.getId());
        assertThat(replaced, is(true));
        assertThat(findItem.getName(), is(replacedItem.getName()));
        assertThat(findItem.getDecs(), is(replacedItem.getDecs()));
        assertThat(findItem.getTime(), is(replacedItem.getTime()));

    }

    /**
     * Проверка поиска  элемента в трекере по имени
     */

    @Test
    public void checkFindByName(){
        Item[] byName = tracker.findByName("Name1");
        assertThat(byName[0], is(item));
        assertThat(byName[1], is(item2));
    }

    /**
     * Проверка поиска всех элементов в трекере
     */

    @Test
    public void checkFindAll(){
        Item[] findAll = tracker.findAll();
        assertThat(findAll, is(allItemsAdd));
    }

    /**
     * Проверка удаления элемента в трекере
     */

    @Test
    public void checkDelete(){
        boolean deleted = tracker.delete(newItem.getId());
        assertThat(deleted, is(true));
    }

}
