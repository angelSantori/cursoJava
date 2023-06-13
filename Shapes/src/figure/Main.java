package figure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        /*Figura figura = new Figura();
        figura.setColor("Rojo");*/

        Color negro = new Color("Negro", 0);
        Color blanco = new Color("Blanco", 0xFFFFFF);
        Color azul = new Color("Azul", 0x0000FF);
        Color rojo = new Color("Rojo", 0xFF0000);

        Color colores[] = new Color[4];

        colores[0] = negro;
        colores[1] = blanco;
        colores[2] = azul;
        colores[3] = rojo;

        /*for (int i = 0; i < colores.length; i++){
            System.out.println("Color número: " + (i+1) + " ; " + colores[i].getNombre());
        }*/

        //ArrayList<Color> coloresList = new ArrayList<>();
        /*for (int i = 0; i < colores.length; i++)
            coloresList.add(colores[i]);

        for (int i = 0; i < colores.length; i++){
            System.out.println("\nColor número: " + (i+1) + " ; " + coloresList.get(i).getNombre());
        }*/

        LinkedList<Color> coloresList = new LinkedList<Color>();

        for (int i = 0; i < colores.length; i++)
            coloresList.add(colores[i]);

        for (int i = 0; i < colores.length; i++){
            System.out.println("\nColor número: " + (i+1) + " ; " + coloresList.get(i).getNombre());
        }

        HashSet<Color> conjuntoColores = new HashSet<Color>();
        conjuntoColores.addAll(coloresList);
        conjuntoColores.contains(rojo); //Existe rojo en la lista?

        HashMap<String,Color> coloresMap = new HashMap<>();
        coloresMap.put(rojo.getNombre(), rojo);
        Color colorRojo = coloresMap.get("Rojo");


        /*Circulo miCiruclo = new Circulo();
        miCiruclo.setColor(azul);
        miCiruclo.setRadio(5);

        String nombre = Circulo.nombreFigura();

        System.out.println("El nombre es: " + nombre);*/

        /*Rectangulo miRectangulo = new Rectangulo();
        miRectangulo.setColor(rojo);
        miRectangulo.setLado1(4);
        miRectangulo.setLado2(8);

        Figura otraFigura = new Circulo();
        otraFigura.setColor(negro);

        System.out.println("El color de otraFigura es: " + otraFigura.getColor());*/

        /*Circulo otroCirculo;
        if (otraFigura instanceof Circulo) {
            otroCirculo = (Circulo) otraFigura;
            otroCirculo.setRadio(5);
            otroCirculo.setColor(azul);
        }*/

        /*String nick;
        nick = "Jose";
        String otro = nick;
        nick = nick + " Ernesto";*/

        /*StringBuilder nick = new StringBuilder();
        nick.append("Jose");
        nick.append(" Ernesto");
        nick.append(" Lara");
        nick.append(" Rodriguez");

        System.out.println("El nombre es \"" + nick.toString() + "\"");

        *//*System.out.println("El nombre es \"" + otro + "\"");*//*

        System.out.println("El color de otraFigura es: " + otraFigura.getColor());

        System.out.println("\nTipo: " + otraFigura.getClass().getSimpleName() + " \n Color: \"" + otraFigura.getColor() + "\"\n Area: " + otraFigura.calcularArea());*/
    }
}
