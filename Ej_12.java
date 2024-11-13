/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_12;

import java.util.Scanner;

/**
 *
 * @author URIEL
 */
public class Ej_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fechaNacimientoStr = scanner.nextLine();
        String fechaActualStr = scanner.nextLine();

        // Separamos las partes de cada fecha
        String[] nacimiento = fechaNacimientoStr.split("/");
        String[] actual = fechaActualStr.split("/");

        // Convertimos las partes a enteros
        int diaNacimiento = Integer.parseInt(nacimiento[0]);
        int mesNacimiento = Integer.parseInt(nacimiento[1]);
        int añoNacimiento = Integer.parseInt(nacimiento[2]);

        int diaActual = Integer.parseInt(actual[0]);
        int mesActual = Integer.parseInt(actual[1]);
        int añoActual = Integer.parseInt(actual[2]);

        // Cálculo de la edad en años
        int edadEnAños = añoActual - añoNacimiento;

        // Ajustamos la edad en años si el mes actual es menor que el mes de nacimiento
        // o si el mes es igual pero el día actual es menor que el día de nacimiento
        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edadEnAños--;
            mesActual+=12;
        }

        // Calculamos la edad en meses
        int edadEnMeses =  mesActual - mesNacimiento;
        if (diaActual < diaNacimiento) {
            edadEnMeses--;
        }

        System.out.println("La edad es: " + edadEnAños + " años y " + edadEnMeses + " meses.");
    }
    
}
