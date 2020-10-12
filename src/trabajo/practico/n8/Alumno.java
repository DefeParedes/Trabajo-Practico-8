package trabajo.practico.n8;

import java.util.HashSet;
import java.util.Iterator;

public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia materia){
        materias.add(materia);
    }
    
    public void mostrarMaterias(){
        for (Materia materia : materias) {
            System.out.println("Nombre: "+materia.getNombre());
            System.out.println("ID: "+materia.getIdMateria());
            System.out.println("Año: "+materia.getAnio());
        }
    }
    
    public int cantidadMaterias(){
        int i=0;
        for(Iterator<Materia> iterator = materias.iterator(); iterator.hasNext();){
            iterator.next();
            i++;
        }
        return i;
    }
}
