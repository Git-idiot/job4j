package ru.job4j.shape;

public class Paint {
    private  ShapeStrategy shapeStrategy;


    public String drawShape(ShapeStrategy shapeStrategy) {
        shapeStrategy.draw();
        return shapeStrategy.draw();
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        System.out.println(paint.drawShape(new Square()));



    }

}
