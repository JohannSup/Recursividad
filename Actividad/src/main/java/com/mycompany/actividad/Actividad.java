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
public class Actividad {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num; 
        String palabra;
        char letra;
        
        System.out.println("Seleeccionar Actividad");
        System.out.println("1.-Muestra Numeros \n2.-Factorial \n3.-Suma \n4.-Palabra");
        int caso = leer.nextInt();
        switch(caso){
            case 1:
                /*System.out.println("Ingresar numero: ");
                num = leer.nextInt();
                Recursividad recur = new Recursividad(num);*/
                /*System.out.println("Proceso");
                recur.muestraNumeros(num);*/
                break;
            case 2:
                /*System.out.println(recur.Factorial(num));*/
                break;
            case 3:
                /*System.out.println(recur.Suma(num));*/
                break;
            case 4:
                System.out.println("Introducir palabra");
                palabra=leer.next();
                System.out.println("Letra que se buscara");
                letra=leer.next().charAt(0);
                Recursividad recur = new Recursividad(palabra, letra);
                recur.muestraPalabra(0);
                break;
            case 5:
                
                break;
            
        }

        
        
        
        
        
        
    }  
}
