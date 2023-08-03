package factoryDesignPattern_ShapeFactory;

public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape01 = shapeFactory.getShape("CIRCLE");
        shape01.draw();

        Shape shape02 = shapeFactory.getShape("RECTANGLE");
        shape02.draw();

        Shape shape03 = shapeFactory.getShape("SQUARE");
        shape03.draw();
    }
}
