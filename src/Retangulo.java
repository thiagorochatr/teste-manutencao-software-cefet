public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new GeometriaException("A base e a altura devem ser maiores que zero.");
        }
        this.base = base;
        this.altura = altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public double calcularArea() {
        return base * altura;
    }
}