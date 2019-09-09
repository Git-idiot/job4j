package ru.job4j.tracker;

public class ItemNotFoundException extends NullPointerException {
    public ItemNotFoundException(String msg) {
        super(msg);
    }
}
