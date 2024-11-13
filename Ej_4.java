/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_4;

import java.util.Scanner;
import java.util.Random;
public class Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Paso 1: Crear un vector para almacenar hasta 10 palabras
        String[] palabras = new String[10];
        System.out.println("Introduce hasta 10 palabras (escribe 'fin' para dejar de introducir):");

        // Leer las palabras
        int cantidadPalabras = 0;
        for (int i = 0; i < 10; i++) {
            String palabra = scanner.nextLine();
            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }
            palabras[cantidadPalabras] = palabra;
            cantidadPalabras++;
        }

        // Paso 2: El ordenador selecciona aleatoriamente una palabra
        String palabraSeleccionada = palabras[random.nextInt(cantidadPalabras)];

        // Paso 3: Inicializar variables para el juego
        int intentos = 0;
        int fallos = 0;
        char[] palabraAdivinada = new char[palabraSeleccionada.length()];
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_'; // Rellenamos con guiones bajos para mostrar las letras adivinadas
        }

        // Paso 4: Comienza el juego
        System.out.println("¡Comienza el juego! Adivina la palabra letra por letra. Tienes 3 intentos fallidos permitidos.");

        while (fallos < 3 && new String(palabraAdivinada).contains("_")) {
            System.out.println("Palabra: " + new String(palabraAdivinada));
            System.out.println("Introduce una letra:");
            char letra = scanner.nextLine().charAt(0);

            boolean acierto = false;
            for (int i = 0; i < palabraSeleccionada.length(); i++) {
                if (palabraSeleccionada.charAt(i) == letra) {
                    palabraAdivinada[i] = letra; // Reemplaza el guión por la letra adivinada
                    acierto = true;
                }
            }

            if (acierto) {
                System.out.println("¡Acierto!");
            } else {
                fallos++;
                System.out.println("Fallaste. Tienes " + (3 - fallos) + " intentos restantes.");
            }

            intentos++;
        }

        // Paso 5: Mostrar resultado del juego
        if (fallos == 3) {
            System.out.println("Has perdido. La palabra era: " + palabraSeleccionada);
        } else {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSeleccionada);
            System.out.println("Lo lograste en " + intentos + " intentos.");
        }
    }
    
}
