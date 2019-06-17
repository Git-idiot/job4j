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
        StubInput input = new StubInput(new String[] {"0", "Name", "Dsc", "6"});
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
        StubInput input = new StubInput(new String[] {"2", forReplace.getId(), "NewName", "NewDsc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(forReplace.getId()).getName(), is("NewName"));
        assertThat(tracker.findById(forReplace.getId()).getDecs(), is("NewDsc"));

    }

    @Test
    public void checkDeleteUI() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("Name1", "Desc1", created);
        Item newItem = tracker.add(item);
        StubInput input = new StubInput(new String[] {"3", newItem.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.size(), is(0));



    }


}
