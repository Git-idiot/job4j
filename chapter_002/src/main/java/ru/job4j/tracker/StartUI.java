package ru.job4j.tracker;
/**
 * @version $Id$
 * @since 0.1
 */

public class StartUI {
    //ConsoleInput consoleInput;
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;

    }
    /**
     * Константы меню трекера.
     */
    private static final String ADD = "0";
    private static final String SHOWALL = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINDBYID = "4";
    private static final String FINDBYNAME = "5";
    private static final String EXIT = "6";

    long created = System.currentTimeMillis();
    Input input;

    //Input c = new Input();
    Tracker tracker = new Tracker();

    /**
     * Method showMenu. Меню.
     */

    public void showMenu() {
        System.out.println("Меню");
        System.out.println(ADD + " Add new item");
        System.out.println(SHOWALL + " Show all items");
        System.out.println(EDIT + " Edit item");
        System.out.println(DELETE + " Deletes item");
        System.out.println(FINDBYID + " Find item by ID");
        System.out.println(FINDBYNAME + " Find item by name");
        System.out.println(EXIT + " Exit program");

    }
    /**
     * Method createItem. Добавление заявки в трекер.
     */
    public void createItem() {
        String askName = input.ask("Введите имя заявки");
        String askDesc = input.ask("Введите описание заявки");
        Item createdItem = tracker.add(new Item(askName, askDesc, created));
        System.out.println("Новая заявка: ID " + createdItem.getId() + " имя " + createdItem.getName());

    }
    /**
     * Method showAllItems. Вывод всех заявок в трекере.
     */
    public void showAllItems() {
        Item[] showAll = tracker.findAll();
        if (showAll.length == 0) {
            System.out.println("Элементы не найдены");
        } else {
            for (Item item : showAll) {
            System.out.println("Заявка ID" + item.getId() + " Имя " + item.getName() + " Описание " + item.getDecs());
        }
        }
    }
    /**
     * Method editItem. Редактирование заявки.
     */

    public void editItem() {
        String askId = input.ask("Введите идентификатор заявки");
        String askName = input.ask("Введите новое имя заявки");
        String askDesc = input.ask("Введите новое описание заявки");
        Boolean editedItem = tracker.replace(askId, new Item(askName, askDesc, created));
    }
    /**
     * Method deleteItem. Удаление заявки.
     */
    public void deleteItem() {
        String askId = input.ask("Введите идентификатор заявки");
        tracker.delete(askId);
        System.out.println("Заявка удалена");
    }
    /**
     * Method findItemById. Поиск заявки по идентификатору.
     */
    public void findItemById() {
        String askId = input.ask("Введите идентификатор заявки");
        Item foundItem = tracker.findById(askId);
        if (foundItem.equals(null)) {
            System.out.println("Item not found");
        } else {
            System.out.println("Заявка ID" + foundItem.getId() + "Имя" + foundItem.getName() + "Описание" + foundItem.getDecs());
        }
    }
    /**
     * Method findItemByName. Поиск заявки по имени.
     */
    public void findItemByName() {
        String askName = input.ask("Введите имя заявки");
        Item[] found = tracker.findByName(askName);
        if (found.length == 0) {
            System.out.println("Заявка не найдена");
        } else {
            for (Item item : found) {
            System.out.println("ID " + item.getId() + " Имя" + item.getName() +  " Описание" + item.getDecs()); }

        }
    }
    /**
     * Method init. Основной цикл.
     */
    public void init() {
        boolean exit = false;
       while (!exit) {
           this.showMenu();
           String r = input.ask("Введите пункт меню");
           if (ADD.equals(r)) {
               this.createItem();
           } else if (r.equals(SHOWALL)) {
               this.showAllItems();

           } else if (r.equals(EDIT)) {
               this.editItem();
           } else if (r.equals(DELETE)) {
               this.deleteItem();
           } else if (r.equals(FINDBYID)) {
               this.findItemById();
           } else if (r.equals(FINDBYNAME)) {
               this.findItemByName();
           } else if (EXIT.equals(r)) {
           exit = true;
           }
       }

       }

    //}

    public static void main(String[] args) {
        //new StartUI(new ConsoleInput(), new Tracker()).init();
        StartUI ui = new StartUI(new ConsoleInput(), new Tracker());
        ui.init();

        }
   }




