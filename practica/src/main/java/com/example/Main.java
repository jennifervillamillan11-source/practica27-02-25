package com.example;

public class Main {
    public static void main(String[] args) {
        // se crean dos instancias de Persona usando el nuevo constructor
        Persona p1 = new Persona(12345678, "Juan", "juan@example.com", 5551234);
        Persona p2 = new Persona(87654321, "María", "maria@example.com", 5559876);

        // se muestran sus atributos en pantalla
        p1.mostrarDatos();
        System.out.println();             // línea en blanco entre ellos
        p2.mostrarDatos();
    }
}