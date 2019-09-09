package ru.job4j.tracker;

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[6];
    long created = System.currentTimeMillis();
    public final static int[] AVAILABLE_RANGE_LIST = new int[] {0, 1, 2, 3, 4, 5, 6, 7};

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillActions() {
        this.actions[0] = new AddItem();
        this.actions[1] = new ShowAllItems();
        this.actions[2] = new EditItem();
        this.actions[3] = new DeleteItem();
        this.actions[4] = new FindItemById();
        this.actions[5] = new FindByName();

    }

    public int getActionsLength() {
        int actionLength = 0;
        for (int i = 0; i < actions.length; i++) {
            actionLength = i;
        }
        return actionLength;
        }

    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);

    }


    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
            System.out.println(action.info());
            }
        }
    }

    private class AddItem implements UserAction {
        @Override
        public int key() {
            return 0;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String askName = input.ask("Введите имя заявки");
            String askDesc = input.ask("Введите описание заявки");
            Item createdItem = tracker.add(new Item(askName, askDesc, created));
            System.out.println("Новая заявка: ID " + createdItem.getId() + " имя " + createdItem.getName());

        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Add new item");
        }
    }

    private class EditItem implements UserAction {
        public int key() {
            return 2;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String askId = input.ask("Введите идентификатор заявки");
            String askName = input.ask("Введите новое имя заявки");
            String askDesc = input.ask("Введите новое описание заявки");
            Boolean editedItem = tracker.replace(askId, new Item(askName, askDesc, created));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Edit item");
        }
    }

    private class DeleteItem implements UserAction {
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String askId = input.ask("Введите идентификатор заявки");
            tracker.delete(askId);
            System.out.println("Заявка удалена");
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Delete item");
        }
    }

    public class FindItemById implements UserAction {
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String askId = input.ask("Введите идентификатор заявки");
            //Item foundItem = tracker.findById(askId);
            try {
                Item foundItem = tracker.findById(askId);
                System.out.println("Заявка ID" + foundItem.getId() + "Имя" + foundItem.getName() + "Описание" + foundItem.getDecs());
            } catch (NullPointerException npe) {
                System.out.println("Заявка не найдена");
                //throw new ItemNotFoundException("Заявка не найдена");
            }
           /* if (foundItem.equals(null)) {
                System.out.println("Item not found");
            } else {
                System.out.println("Заявка ID" + foundItem.getId() + "Имя" + foundItem.getName() + "Описание" + foundItem.getDecs());
            }*/
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by ID");
        }
    }

    public class ShowAllItems implements UserAction {
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            Item[] showAll = tracker.findAll();
            if (showAll.length == 0) {
                System.out.println("Элементы не найдены");
            } else {
                for (Item item : showAll) {
                    System.out.println("Заявка ID" + item.getId() + " Имя " + item.getName() + " Описание " + item.getDecs());
                }
            }
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Show all items");
        }
    }

    public class FindByName implements UserAction {
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String askName = input.ask("Введите имя заявки");
            Item[] found = tracker.findByName(askName);
            if (found.length == 0) {
                System.out.println("Заявка не найдена");
            } else {
                for (Item item : found) {
                    System.out.println("ID " + item.getId() + " Имя" + item.getName() +  " Описание" + item.getDecs()); }

            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by name");
        }
    }

    /**
     * Method checkKeyInAvailableRangeList. Проверка ключа на вхождение в массив.
     */
    public static int checkKeyInAvailableRangeList(int key, int[] range) {
        boolean found = false;
        if (range.length == 0) {
            for (int i = 0; i < AVAILABLE_RANGE_LIST.length; i++) {
                if (AVAILABLE_RANGE_LIST[i] == key) {
                    found = true;
                    break;
                }
            }
        } else {
            for (int i = 0; i < range.length; i++) {
                if (range[i] == key) {
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            throw new MenuOutException("Menu out of range - check");
        }
        return key;
    }
}
