package mascotas;

import java.util.Set;

public class Persona {
    private Set<Mascota> mascotas;

    public Set<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(Set<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    private String nombre;
    //private Mascota mascota;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Borrado poque se creó private Set<Mascota> mascotas;
    /*public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }*/
}
