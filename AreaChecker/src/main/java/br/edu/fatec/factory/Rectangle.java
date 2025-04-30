package br.edu.fatec.factory;

class Rectangle implements Calculable {
    private double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calcularArea() {
        return width * height;
    }
}
