package com.uco.hackathon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quieres solo ida o ida y regreso");
        String respuesta = scanner.nextLine();

        switch (respuesta) {
            case "ida":
                System.out.print("Ingrese la cantidad de equipos a registrar:");
                int cantidadEquipos = scanner.nextInt();
                scanner.nextLine();

                String[] equipo = new String[cantidadEquipos];

                for (int i = 0; i < cantidadEquipos; i++) {
                    System.out.println("Registre el equipo numero " + (i + 1));
                    equipo[i] = scanner.nextLine();
                }
                for (int i = 0; i < cantidadEquipos - 1; i++) {
                    for (int j = i + 1; j < equipo.length; j++) {
                        System.out.println(equipo[i] + " vs " + equipo[j]);
                    }
                }
                break;

            case "ida y regreso":
                System.out.println("Ingrese la cantidad de equipos a registrar");
                int cantidadIdaVuelta = scanner.nextInt();
                scanner.nextLine();

                String[] equipoIdaVuelta = new String[cantidadIdaVuelta];
                for (int i = 0; i < cantidadIdaVuelta; i++) {
                    System.out.println("Registre el equipo numero " + (i + 1));
                    equipoIdaVuelta[i] = scanner.nextLine();
                }

                for (int i = 0; i < cantidadIdaVuelta - 1 ; i++) {
                    for (int j = i + 1; j < equipoIdaVuelta.length; j++) {
                        System.out.println(equipoIdaVuelta[i] + " vs " + equipoIdaVuelta[j]);
                        System.out.println(equipoIdaVuelta[j] + " vs " + equipoIdaVuelta[i]);
                    }
                }
                break;

            default:
                System.out.println("Escoja si es ida o es de vuelta");
        }

    }
}
