package ru.job4j.shape;

public class Square implements ShapeStrategy {
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append(" ++++ \n");
        pic.append("+     + \n");
        pic.append("+     +\n");
        pic.append(" ++++\n");
        return pic.toString();
    }
}
