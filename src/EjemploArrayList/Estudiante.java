/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploArrayList;

/**
 *
 * @author JENG-PC
 */
public class Estudiante { 
           int cedula;
           String Nombre;
           String Apellido;
           float nota; 

    public Estudiante(int cedula, String Nombre, String Apellido, float nota) {
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.nota = nota;
    }
    public Estudiante(){}

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public float getNota() {
        return nota;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
           
           
}
