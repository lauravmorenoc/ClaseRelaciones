/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Estudiante
 */
public class ClaseRE {

    /**
     * @param args the command line arguments
     */
    
    //Relaciones de asociación
      // 1.Sentido (uni-direccional: que solo se puede navegar desde una clase a otra
    //, bi-direccional: se puede navegar desde la primera clase a la segunda o viceversa)
      //2. Espacio de acceso (privado, publico...)
      //3. Rol (nombre de la variable)
      //4. Cardinalidad: Indica con cuantos objetos de otra clase está relacionado un objeto de la primera clase
    //Libro: fund de programacion aprendizaje basado en casos uni anges gitbooks
    public static void main(String[] args) {
        Fecha fNacimiento[]=new Fecha[5];
        Fecha fIngreso[]=new Fecha[5];
        fNacimiento[0]=new Fecha(14, 5, 2001);
        fIngreso[0]=new Fecha(20, 1, 2022);
        Empleado e[]=new Empleado[5];
        e[0]=new Empleado("Laura", "Moreno", "Femenino", fNacimiento[0], fIngreso[0]);
        
        
    }
    
}
