package figure;

public abstract class Figura {
    protected Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract int calcularArea();
}
