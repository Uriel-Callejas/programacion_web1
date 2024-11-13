/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_14;

import java.util.Scanner;

/**
 *
 * @author URIEL
 */
public class Ej_14 {

    public static boolean sonAnagramas(String palabra1, String palabra2) {
        // Convertir ambas palabras a minúsculas para evitar problemas de mayúsculas y minúsculas
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        // Si las longitudes de las palabras son diferentes, no pueden ser anagramas
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        // Crear un array de frecuencias para contar las ocurrencias de cada letra en la primera palabra
        int[] frecuencias = new int[26];
        for (char c : palabra1.toCharArray()) {
            frecuencias[c - 'a']++;
        }

        // Contar las ocurrencias de cada letra en la segunda palabra y restarlas del array de frecuencias
        for (char c : palabra2.toCharArray()) {
            frecuencias[c - 'a']--;
        }

        // Si todas las frecuencias son cero, significa que las palabras tienen las mismas letras
        for (int frecuencia : frecuencias) {
            if (frecuencia != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un texto");
        String cad1 = scanner.nextLine();
        System.out.println("Ingresa un texto");
        String cad2 = scanner.nextLine();

        if (sonAnagramas(cad1, cad2)) {
            System.out.println("Las palabras son anagramas.");
        } else {
            System.out.println("Las palabras no son anagramas.");
        }
    }
    
}
