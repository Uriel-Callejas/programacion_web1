/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_18;

import java.util.Scanner;

/**
 *
 * @author Sistemas
 */
public class Ej_18 {

    public static void encriptarI(String texto) {
        String res="";
        String aux="";
        char x;
        for (int i = 0; i < texto.length(); i++) {
            x=texto.charAt(i);
            if (x!=' ') {
                aux=x+aux;
            }else {
                res+=aux+x;
                aux="";
            }
        }
        res+=aux;
        System.out.println("Ordenado: "+res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto:");
        String texto = sc.nextLine().toLowerCase();
        encriptarI(texto);
    }
    
}
