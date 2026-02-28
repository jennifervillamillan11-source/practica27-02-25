package com.example;

public class Persona {
    private String nombre;
    private String apellido;
    private String documento;      // número de identidad
    private int anioNacimiento;

    // constructor sin parámetros (por defecto)
    // permite crear una Persona con valores iniciales vacíos o predeterminados
    public Persona() {
        // opcional: inicializar con valores por defecto
        this.nombre = "";
        this.apellido = "";
        this.documento = "";
        this.anioNacimiento = 0;
    }

    // constructor que inicializa todos los atributos
    public Persona(String nombre, String apellido,
                   String documento, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.anioNacimiento = anioNacimiento;
    }

    // método que imprime en pantalla los valores del objeto
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Documento: " + documento);
        System.out.println("Año de nacimiento: " + anioNacimiento);
    }
}