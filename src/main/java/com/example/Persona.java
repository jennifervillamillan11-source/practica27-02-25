package com.example;

public class Persona {

    private String nombre;
    private String apellido;
    private int documento;
    private String anioNacimiento;
    private String paisNacimiento;
    private byte genero; //0 masculino, 1 femenino, 2 otro

    public Persona() {
    }

    // constructor añadido para coincidir con el Main
    // y manejar email/telefono/año como valores simples
    private String email;
    private int telefono;

    public Persona(int documento, String nombre, String email, int telefono, int anioNacimiento) {
        setDocumento(documento);
        setNombre(nombre);
        this.email = email;
        this.telefono = telefono;
        setAnioNacimiento(String.valueOf(anioNacimiento));
    }

    public Persona(String nombre, String apellido, int documento, String anioNacimiento, String paisNacimiento, byte genero) {
        setNombre(nombre);
        setApellido(apellido);
        setDocumento(documento);
        setPaisNacimiento(paisNacimiento);
        setGenero(genero);
    }

    public String getNombre() {
        return nombre;
    }

    // Compatibilidad con codigo existente
    public String getnombre() {
        return getNombre();
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellido no puede estar vacio");
        }
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        if (documento <= 0) {
            throw new IllegalArgumentException("El documento debe ser mayor que 0");
        }
        this.documento = documento;
    }

    public String getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(String anioNacimiento) {
        if (anioNacimiento == null || anioNacimiento.trim().isEmpty()) {
            throw new IllegalArgumentException("El anio de nacimiento no puede estar vacio");
        }

        int anio;
        try {
            anio = Integer.parseInt(anioNacimiento);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("El anio de nacimiento debe ser numerico", e);
        }

        int anioActual = java.time.Year.now().getValue();
        if (anio < 1900 || anio > anioActual) {
            throw new IllegalArgumentException("El anio de nacimiento no es valido");
        }

        this.anioNacimiento = anioNacimiento;
    }

    public int calcularEdad() {
        int anioActual = java.time.Year.now().getValue();
        return anioActual - Integer.parseInt(anioNacimiento);
    }
    public String getPaisNacimiento() {
        return paisNacimiento;
    }
    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }
    public byte getGenero() {
        return genero;
    }
    public void setGenero(byte genero) {
        if (genero < 0 || genero > 2) {
            throw new IllegalArgumentException("El genero debe ser 0 (masculino), 1 (femenino) o 2 (otro)");
        }
        this.genero = genero;
    }

    // método auxiliar para imprimir datos
    public void imprimir() {
        System.out.println("Documento: " + documento);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        if (email != null) System.out.println("Email: " + email);
        if (telefono != 0) System.out.println("Teléfono: " + telefono);
    }
}