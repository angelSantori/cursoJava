package mascotas;

import java.util.Set;

public class Mascota {
    private Set<Persona> duegnos;

    public Set<Persona> getDuegnos() {
        return duegnos;
    }

    public void setDuegnos(Set<Persona> duegnos) {
        this.duegnos = duegnos;
    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*private Persona duegno;

    public Persona getDuegno() {
        return duegno;
    }

    public void setDuegno(Persona duegno) {
        this.duegno = duegno;
    }*/
}
