/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_19;

import java.util.Scanner;

/**
 *
 * @author Sistemas
 */
public class Ej_19 {

    public static void algoritmoCesar(String texto,int n) {
        String abc="abcdefghijklmnñopqrstuvwxyzabcdefghijklmnñopqrstuvwxyz";
        String res="";
        String aux="";
        char x;
        for (int i = 0; i < texto.length(); i++) {
            x=texto.charAt(i);
            for (int j = 0; j < abc.length(); j++) {
                if (x==abc.charAt(j)) {
                    res+=abc.charAt(j+n);
                    break;
                }
            }
        }
        res+=aux;
        System.out.println("Codificado: "+res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto:");
        String texto = sc.nextLine().toLowerCase();
        System.out.println("Introduce cantidad de rotaciones:");
        int n = sc.nextInt();
        algoritmoCesar(texto,n);
    }
    
}
