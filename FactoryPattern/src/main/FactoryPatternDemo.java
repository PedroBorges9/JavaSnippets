package main;

public class FactoryPatternDemo {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();
    }

}
