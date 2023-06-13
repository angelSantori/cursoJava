package figure;

public class Circulo extends Figura{

    private static int numero;
    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void setColor(Color color) {
        if (color.getValor() == 0xFF0000) {
            throw new Error("Los circulos no pueden ser de color rojo");
        }
    }

    public int calcularArea() {
        return (int) (radio * Math.PI * 2);
    }

    public static String nombreFigura(){
        return "Círculo";
    }
}
