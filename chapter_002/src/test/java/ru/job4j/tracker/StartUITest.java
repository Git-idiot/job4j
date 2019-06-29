package ru.job4j.tracker;
import org.junit.Test;
import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    /**
     * Проверка добавления элемента через интерфейс
     */
    @Test
    public void checkAddUI() {
        Tracker tracker = new Tracker();
        StubInput input = new StubInput(new String[] {"0", "Name", "Dsc", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("Name"));
        assertThat(tracker.findAll()[0].getDecs(), is("Dsc"));
    }

    /**
     * Проверка изменения элемента через интерфейс
     */
    @Test
    public void checkReplaceUI() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("Name1", "Desc1", created);
        Item forReplace = tracker.add(item);
        StubInput input = new StubInput(new String[] {"2", forReplace.getId(), "NewName", "NewDsc", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(forReplace.getId()).getName(), is("NewName"));
        assertThat(tracker.findById(forReplace.getId()).getDecs(), is("NewDsc"));

    }
    /**
     * Проверка удаления элемента через интерфейс
     */
    @Test
    public void checkDeleteUI() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("Name1", "Desc1", created);
        Item newItem = tracker.add(item);
        StubInput input = new StubInput(new String[] {"3", newItem.getId(), "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.size(), is(0));

    }
    /**
     * Проверка вывода всех элементов через интерфейс
     */

    @Test
    public void checkShowAll() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item1 = new Item("Name1", "Desc1", created);
        Item item2 = new Item("Name2", "Desc2", created);
        Item newItem1 = tracker.add(item1);
        Item newItem2 = tracker.add(item2);
        StubInput input = new StubInput(new String[] {"1", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("Name1"));
        assertThat(tracker.findAll()[0].getDecs(), is("Desc1"));
        assertThat(tracker.findAll()[1].getName(), is("Name2"));
        assertThat(tracker.findAll()[1].getDecs(), is("Desc2"));
    }

    /**
     * Проверка поиска элемента по идентификатору через интерфейс
     */
    @Test
    public void checkFindById() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("Name1", "Desc1", created);
        Item newItem = tracker.add(item);
        StubInput input = new StubInput(new String[] {"4", item.getId(), "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("Name1"));
        assertThat(tracker.findById(item.getId()).getDecs(), is("Desc1"));
    }

    /**
     * Проверка поиска элемента по имени через интерфейс
     */
    @Test
    public void checkFindByName() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("Name1", "Desc1", created);
        Item newItem = tracker.add(item);
        StubInput input = new StubInput(new String[] {"5", item.getName(), "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("Name1"));
        assertThat(tracker.findById(item.getId()).getDecs(), is("Desc1"));
    }

}
