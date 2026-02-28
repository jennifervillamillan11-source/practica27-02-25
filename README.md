# Practica Project

## Actualizacion de digramas de clases 
classDiagram
    class Persona {
        - String nombre
        - String apellido
        - String documento
        - int anioNacimiento
        + Persona()
        + Persona(String, String, String, int)
        + void mostrarDatos()
    }

    class Main {
        + static void main(String[] args)
    }

    Main --> Persona : utiliza