package com.example.a1143872076.myapplication;

public class Contacto {

    private String nombre, telefono,genero;
    //private String urlImg;


    public Contacto(String nombre, String telefono, String genero) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.genero = genero;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String titulo) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
