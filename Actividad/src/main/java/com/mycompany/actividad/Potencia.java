/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad;

import java.util.Scanner;

/**
 *
 * @author CC7
 */
public class Potencia {
    public static void main(String[] args) {
        Scanner objScanner= new Scanner(System.in);
        
        System.out.println("Ingrese el numero ");
        int numero = objScanner.nextInt();
        System.out.println("Ingrese la potencia: ");
        int potencia=objScanner.nextInt();
        System.out.println("Resultado "+ Potencia(numero, potencia));
    
    
    }
    
    
    
    
    public static int Potencia(int numero , int potencia){
        if(potencia==0){
            return 1;
            
        }else{
            return numero * Potencia(numero, potencia-1);
        }
        
    }
    
}
