/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_9;

import java.util.Scanner;

/**
 *
 * @author URIEL
 */
public class Ej_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un texto");
        String str=sc.nextLine(),caracter="",res="";
        
        do{
            System.out.println("Ingrese un caracter");
            caracter=sc.nextLine();
        }while(caracter.length()>1);  
        char aux=caracter.charAt(0),x;
        for (int i = 0; i < str.length(); i++) {
            x=str.charAt(i);
            if (x!=aux) {
                res+=x;
            }
        }
        System.out.println("Nuevo texto: "+res);
    }            
}
