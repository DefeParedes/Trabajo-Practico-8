package trabajo.practico.n8;

public class TrabajoPracticoN8 {

   
    public static void main(String[] args) {
       Materia ingles1 = new Materia(101,"Ingles I",1);
       Materia mate = new Materia(102,"Matematica",1);
       Materia labo1 = new Materia(103,"Laboratorio",1);
       Alumno alum1 = new Alumno(1001,"Lopez","Martin");
       Alumno alum2 = new Alumno(1002,"Martinez","Brenda");
       alum1.agregarMateria(ingles1);alum1.agregarMateria(mate);alum1.agregarMateria(labo1);
       alum2.agregarMateria(ingles1);alum2.agregarMateria(mate);alum2.agregarMateria(labo1);alum2.agregarMateria(labo1);
       System.out.println(alum1.getNombre()+" cursa "+alum1.cantidadMaterias()+" materias.");
       System.out.println(alum2.getNombre()+" cursa "+alum2.cantidadMaterias()+" materias.");
    }
    
    //e) a) HastSet hereda de la clase Set, y la clase Set permite colecciones donde los valores dentro de la coleccion no se repiten.
    //e) b) Se utilizo un HastSet para evitar que hubiera valores repetidos.
    
}
