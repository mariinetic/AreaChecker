package br.edu.fatec.main;

import br.edu.fatec.factory.*;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactoryImpl();

        Calculable[] shapes = new Calculable[] {
            factory.getShape(ShapeType.SQUARE, new Double[]{5.0}),
            factory.getShape(ShapeType.RECTANGLE, new Double[]{4.0, 6.0}),
            factory.getShape(ShapeType.CIRCLE, new Double[]{3.0}),
            factory.getShape(ShapeType.TRIANGLE, new Double[]{6.0, 4.0}),
            factory.getShape(ShapeType.PARALLELOGRAM, new Double[]{5.0, 3.0}),
            factory.getShape(ShapeType.TRAPEZO, new Double[]{8.0, 4.0, 3.0}),
            factory.getShape(ShapeType.HEXAGON, new Double[]{2.0}),
            factory.getShape(ShapeType.DIAMOND, new Double[]{6.0, 4.0}),
            factory.getShape(ShapeType.CUBE, new Double[]{2.0})
        };

        ShapeType[] types = ShapeType.values();
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Área do " + types[i].name() + ": " + shapes[i].calcularArea());
        }
    }
}
