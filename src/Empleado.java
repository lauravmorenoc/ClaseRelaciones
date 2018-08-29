/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private String genero;
    private String foto;
    private Fecha fNacimiento;
    private Fecha fIngreso;
    public Empleado(String nombre, String apellido, String genero, Fecha fNacimiento, Fecha fIngreso){
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=genero;
        this.fNacimiento=fNacimiento;
        this.fIngreso=fIngreso;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public Fecha getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(Fecha fIngreso) {
        this.fIngreso = fIngreso;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre + " " + this.apellido);
        System.out.println("Genero: " + this.genero);
        System.out.print("Fecha de nacimiento: ");
        this.fNacimiento.mostrarFecha();
        System.out.print("Fecha de ingreso: ");
        this.fIngreso.mostrarFecha();
    }
}
