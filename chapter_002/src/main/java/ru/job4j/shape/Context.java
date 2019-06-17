package ru.job4j.shape;

public class Context {
    private ShapeStrategy shapeStrategy;

    public Context(ShapeStrategy shapeStrategy){
        this.shapeStrategy = shapeStrategy;
    }

    public String executeStrategy(){
        return shapeStrategy.draw();
    }
}
