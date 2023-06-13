package figure;

public class Color {
    private String nombre;
    private int valor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int value) {
        this.valor = value;
    }

    public Color(String nombre, int value) {
        super();
        this.nombre = nombre;
        this.valor = value;
    }

    public String toString(){
        return this.nombre;
    }
}
