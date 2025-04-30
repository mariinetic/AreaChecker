package br.edu.fatec.factory;

class Diamond implements Calculable {
    private double diagonalMaior, diagonalMenor;

    Diamond(double d1, double d2) {
        this.diagonalMaior = d1;
        this.diagonalMenor = d2;
    }

    @Override
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }
}
