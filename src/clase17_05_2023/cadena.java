package clase17_05_2023;

public class cadena {
    public static void main(String[] args) {

        String nombre;
        nombre = "Jose";

        String otro = nombre;
        nombre = nombre + " Ernesto";

        System.out.println("El nombre es: " + nombre);
        System.out.println("El nombre es: " + otro);

        StringBuilder nombre2 = new StringBuilder();
        nombre2.append("Jose");
        nombre2.append(" Ernesto");
        nombre2.append(" Lara");
        nombre2.append(" Rodriguez");

        System.out.println(nombre2);

        /*Color colores[] = new Color[4];
        colores[0] = negro;
        colores[1] = blanco;
        colores[2] = azul;
        colores[3] = rojo;

        for (int i = 0; i < colores.length; i++){
            System.out.println("Color numero ");
        }*/

        //Cadena
        //Arreglo
        //ArrayLsit
        //LinkedList
        //HashSet
        //HashMap

    }
}
