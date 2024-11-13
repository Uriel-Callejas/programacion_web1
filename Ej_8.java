/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_8;

import java.util.Scanner;

/**
 *
 * @author Sistemas
 */
public class Ej_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un texto");
        String str=sc.nextLine();
        System.out.println("Ingrese otro texto");
        String str1=sc.nextLine();
        System.out.println("Ingrese un numero");
        int k=sc.nextInt();
        String str_aux1="",str_aux2="";
        if (str.length()>k) {
            str_aux1=str.substring(0,k);
            str_aux1+=str1;
            str_aux1+=str.substring(k,str.length());
        }
        System.out.println("El resultado es: "+str_aux1);
    }
    
}
