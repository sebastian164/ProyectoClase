package com.proyectoClase;

public class Robot {
    int idRobot;
    String nombreRobot;

    public int getIdRobot() {
        return idRobot;
    }

    public void setIdRobot(int idRobot) {
        this.idRobot = idRobot;
    }

    public String getNombreRobot() {
        return nombreRobot;
    }

    public void setNombreRobot(String nombreRobot) {
        this.nombreRobot = nombreRobot;
    }

    public int imprimirNumero(int numero) {
        System.out.println("el numero es : "+numero);
        return numero*numero;
    }
}
