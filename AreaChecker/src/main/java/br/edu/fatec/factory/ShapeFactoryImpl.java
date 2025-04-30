package br.edu.fatec.factory;

public class ShapeFactoryImpl implements ShapeFactory {

    @Override
    public Calculable getShape(ShapeType type, Double[] values) {
        return switch (type) {
            case SQUARE -> new Square(values[0]);
            case RECTANGLE -> new Rectangle(values[0], values[1]);
            case CIRCLE -> new Circle(values[0]);
            case TRIANGLE -> new Triangle(values[0], values[1]);
            case PARALLELOGRAM -> new Parallelogram(values[0], values[1]);
            case TRAPEZO -> new Trapezo(values[0], values[1], values[2]);
            case HEXAGON -> new Hexagon(values[0]);
            case DIAMOND -> new Diamond(values[0], values[1]);
            case CUBE -> new Cube(values[0]);
        };
    }
}
