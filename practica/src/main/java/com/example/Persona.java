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
Persona() {}


Persona(int cedula){
this.cedula= cedula;
}
// contructor con parametros cedula,nombre correo y telefono
Persona (int cedula,String nombre,String correo,int telefono){
this.cedula= cedula;
this.nombre= nombre;
this.correo= correo;
this.telefono= telefono;
}
}