package com.example;

public class Persona {
    
// atributos de clase persona
// caracteristicas  que identifican a una clase persona
private int cedula;
public String nombre;
public String correo;
private int telefono;

//contructor de la clase persona
// contructor vacio
public Persona() {}


public Persona(int cedula){
    this.cedula = cedula;
}
// contructor con parametros cedula, nombre, correo y telefono
public Persona(int cedula, String nombre, String correo, int telefono){
    this.cedula = cedula;
    this.nombre = nombre;
    this.correo = correo;
    this.telefono = telefono;
}

    // método que imprime en pantalla los valores del objeto
    public void mostrarDatos() {
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telefono);
    }
}