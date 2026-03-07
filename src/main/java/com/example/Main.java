package com.example;

public class Main {
    public static void main(String[] args) {
        // se crean dos instancias de Persona usando el nuevo constructor
        Persona p1 = new Persona(12345678, "Jennifer", "jennifer@example.com", 5666666, 1996);
        Persona p2 = new Persona(87654321, "johana", "johana@example.com", 55788555, 1995);
        System.out.println("Datos de persona 1");
        p1.imprimir();
        System.out.println("Datos de persona 2");
        p2.imprimir();

}
}