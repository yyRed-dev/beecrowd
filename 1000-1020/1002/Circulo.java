public class Circulo {

    private double raio;
    static double pi = 3.14159;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public double diametro() {
        return 2*raio;
    }

    public double perimetro() {
        return 2*pi*raio;
    }

    public double area() {
        return pi*raio*raio;
    }

    @Override
    public String toString() {
        String resultado = "=== Circulo === \n" +
                            "Raio: " + this.getRaio() +"\n" +
                            "Perimetro: " + this.perimetro() + "\n" +
                            "Area: "  + this.area();

        return resultado;
    }
}