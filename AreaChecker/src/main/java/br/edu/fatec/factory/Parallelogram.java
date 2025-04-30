package br.edu.fatec.factory;

class Parallelogram implements Calculable {
    private double base, height;

    Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calcularArea() {
        return base * height;
    }
}
