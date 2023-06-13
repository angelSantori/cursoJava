package figure;

public class Cuadrado extends Figura{
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int calcularArea() {
        return lado * lado;
    }
}
