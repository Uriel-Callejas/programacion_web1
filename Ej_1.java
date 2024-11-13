/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_1;

import java.util.Scanner;

/**
 *
 * @author Sistemas
 */
public class Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un texto");
        String str=sc.nextLine();
        str=str.toLowerCase();
        char x;
        int conta_vocales=0;
        int conta_otro=0;
        for (int i = 0; i < str.length(); i++) {
            x=str.charAt(i);
            switch (x){
                case ('a'):
                    conta_vocales++;
                    break;
                case ('e'):
                    conta_vocales++;
                    break;
                case ('i'):
                    conta_vocales++;
                    break;
                case ('o'):
                    conta_vocales++;
                    break;
                case ('u'):
                    conta_vocales++;
                    break;
                case (' '):
                    break;
                default:
                    conta_otro++;
                    break;
            }
        }
        System.out.println("Cantidad de vocales: "+conta_vocales++);
        System.out.println("Cantidad de consonantes: "+conta_otro++);
    }
    
}
