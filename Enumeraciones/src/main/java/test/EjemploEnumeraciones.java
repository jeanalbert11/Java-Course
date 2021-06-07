package test;

import enumeraciones.*;

public class EjemploEnumeraciones {

    public static void main(String[] args) {
        //valores de la enumeracion
        System.out.println("Valor 1:" + Dias.LUNES);
        System.out.println("Valor 2:" + Dias.MARTES);

        //utilizamos la enumeracion de paises
        System.out.println("Contienente no. 4:" + Continentes.AMERICA);
        System.out.println("Accedemos al numero de paises del continente 4:"
                + Continentes.AMERICA.getPaises());

        System.out.println("Accedemos al continente 1:" + Continentes.AFRICA);
        System.out.println("No. de paises del continente 1:" + Continentes.AFRICA.getPaises());

        indicarDia(Dias.LUNES);
        imprimirContinentes();
    }

    private static void indicarDia(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
        }
    }

    public static void imprimirContinentes() {
        for (Continentes continente : Continentes.values()) {
            System.out.println("CONTINENTE:" + continente + " Contiene: " + continente.getPaises() + " Paises");
        }
    }
}
