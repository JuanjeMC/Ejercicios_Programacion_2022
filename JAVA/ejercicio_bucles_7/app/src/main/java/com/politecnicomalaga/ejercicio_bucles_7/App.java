/*F8 para continuar el debug
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.politecnicomalaga.ejercicio_bucles_7;

import java.util.Scanner;

public class App { //todo esto es una clase

    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in); //teclado = objeto

        int select;
        String password = "0000"; //si ponemos "password." y salen propiedades, es un objeto.
        String entrada;
        
        do {
            System.out.println("1. Asignar nueva combinación"); 
            //mensaje Objeto-> Sistema. Objeto-> Fuera. Método(para objeto)/Mensaje-> imprime  //parametro->("esto")
            System.out.println("2. Abrir caja fuerte");
            System.out.println("0. Salir");

            select = teclado.nextInt();
            if (select == 1) {
                System.out.println("Ingrese su contraseña (por defecto 0000):");
                entrada = teclado.next();

                if (entrada.equals(password)) {
                    System.out.println("Contraseña aceptada, introduzca nueva contraseña:");

                    password = teclado.next();
                    if (password.length() > 4 || password.length() < 4) {
                        do {
                            System.out.println("Contraseña con formato incorrecto, debe tener cuatro caracteres:");
                            System.out.println("");
                            password = teclado.next();
                            System.out.println("");

                        } while (password.length() > 4 || password.length() < 4); //!=
                    }
                } else 
                    System.out.println("Error, contraseña no aceptada.");
            } else if (select == 2) {
                System.out.println("Introduzca contraseña:");
                entrada = teclado.next();
                if (entrada.equals(password)) {
                    System.out.println("╔═════════════════════════╗");
                    System.out.println("║  ¡Caja fuerte abierta!  ║");
                    System.out.println("╚═════════════════════════╝");
                    System.out.println("");
                }else
                    System.out.println("Error, contraseña no aceptada.");

            } else if (select != 0) {
                System.out.println("\nNo existe esa opción");
                System.out.println("");

            }
        } while (select != 0);

    }
}
//##########################################################################