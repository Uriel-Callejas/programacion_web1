/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_17;

import java.util.Scanner;

/**
 *
 * @author Sistemas
 */
public class Ej_17 {

    public static void ordenarABC(String texto) {
        String abc="abcdefghijklmnopqrstuvwxyz";
        String res="";
        int cont=0;
        char x;
        texto = texto.toUpperCase();
        abc = abc.toUpperCase();
        for (int i = 0; i < abc.length(); i++) {
            x=abc.charAt(i);
            for (int j = 0; j < texto.length(); j++) {
                if(x==texto.charAt(j)){
                    res+=texto.charAt(j);
                }
            }
        }
        System.out.println("Ordenado: "+res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto:");
        String texto = sc.nextLine().toLowerCase();
        ordenarABC(texto);
    }
    
}
