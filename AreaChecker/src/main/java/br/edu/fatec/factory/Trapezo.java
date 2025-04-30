package br.edu.fatec.factory;

class Trapezo implements Calculable {
    private double base1, base2, height;

    Trapezo(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double calcularArea() {
        return ((base1 + base2) * height) / 2;
    }
}
