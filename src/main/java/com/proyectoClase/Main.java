package com.proyectoClase;

public class Main {
    public static void main(String[] args) {
        Saludar();

        Robot robotColmena = new Robot();
        Robot pilotoAvion = new Robot();

        IAs face = new IAs();
        IAs mover = new IAs();

        robotColmena.imprimirNumero(5);

    }

    private static void Saludar() {
        System.out.println("hola mundo");
    }

}