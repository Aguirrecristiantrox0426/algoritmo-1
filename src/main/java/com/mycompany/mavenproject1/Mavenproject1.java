/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Mavenproject1 {

    public static void main(String[] args) {
    float valor1,valor2,resultado;
    Scanner teclado=new Scanner (System.in);
    System.out.println("digite el valor de 1");
    valor1=teclado.nextInt();
    System.out.println("digite el valor de 2");
    valor2=teclado.nextInt();
    resultado=valor1+valor2;
    System.out.println("el resultado es"+resultado);
    
     
    }
}
