/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_20;

import java.util.Scanner;

/**
 *
 * @author Sistemas
 */
public class Ej_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto:");
        String texto = sc.nextLine(),res="";
        res+=texto.substring(1);
        res+=texto.substring(0,1);
        System.out.println("Cadena Rotada: "+res);
    }
    
}
