/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_21;

import java.util.Scanner;

/**
 *
 * @author Sistemas
 */
public class Ej_21 {

    public static void coincidenciasLetas(String texto) {
        int cont=0;
        char x;
        for (int i = 0; i < texto.length(); i++) {
            x=texto.charAt(i);
            cont=0;
            for (int j = i; j < texto.length(); j++) {
                if (x!=' '&&x!='.'&&x==texto.charAt(j)) {
                    cont++;
                }
            }
            if (cont>0) {
                System.out.print(x+"="+cont+", ");
                cont=0;
                texto=texto.replace(x, '.');
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto:");
        String texto = sc.nextLine().toLowerCase();
        coincidenciasLetas(texto);
        System.out.println("");
    }
    
}
