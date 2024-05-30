package org.example;

public class Hoteles {
    String ID_Hotel;
    String ubicacion;
    int pisos;
    String nombre;
    int numeroHabitaciones;

    public Hoteles() {
    }

    public Hoteles(String ubicacion, String ID_Hotel, int pisos, String nombre, int numeroHabitaciones) {
        this.ubicacion = ubicacion;
        this.ID_Hotel = ID_Hotel;
        this.pisos = pisos;
        this.nombre = nombre;
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getID_Hotel() {
        return ID_Hotel;
    }

    public void setID_Hotel(String ID_Hotel) {
        this.ID_Hotel = ID_Hotel;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    //Métodos Personalizados
    public void imprimirDatos(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("ID_Hotel: " + this.getID_Hotel());
        System.out.println("Ubicación: " + this.getUbicacion());
        System.out.println("Número de pisos: " + this.getPisos());
        System.out.println("Número de pisos: " + this.getNumeroHabitaciones());
        }

    public void modificarDatos(String nombre, String ID_Hotel, String ubicacion, int pisos, int numeroHabitaciones) {
        this.nombre = nombre;
        this.ID_Hotel = ID_Hotel;
        this.ubicacion = ubicacion;
        this.pisos = pisos;
        this.numeroHabitaciones = numeroHabitaciones;
        }

    public void modificarDatos2() {
        this.nombre = null;
        this.ID_Hotel = null;
        this.ubicacion = null;
        this.pisos = 0;
        this.numeroHabitaciones = 0;
    }





    }


