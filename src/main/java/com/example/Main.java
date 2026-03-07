package com.example;

public class Main {
    public static void main(String[] args) {
        // se crean dos instancias de Persona usando el nuevo constructor
        Persona p1 = new Persona(12345678, "Juan", "juan@example.com", 5551234, 1990);
        Persona p2 = new Persona(87654321, "María", "maria@example.com", 5559876, 1985);
        System.out.println("Datos de persona 1");
        p1.imprimir();
        System.out.println("Datos de persona 2");
        p2.imprimir();

}
}