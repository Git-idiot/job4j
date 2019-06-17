package ru.job4j.shape;

public class Paint {

    public static void main(String[] args) {
        Context context = new Context(new Triangle());
        System.out.println(context.executeStrategy());
        context = new Context(new Square());
        System.out.println(context.executeStrategy());
    }
}
