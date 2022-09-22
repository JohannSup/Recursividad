/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad;

/**
 *
 * @author CC7
 */
public class Recursividad {
    
    private String palabra;
    private char letra;
    private int total;
    
    public Recursividad (String palab, char letr){
        palabra=palab;
        letra = letr;
    }
    
    
    public void muestraPalabra(int tamaño){
        if(palabra.length()==tamaño){
            tamaño = 0;
            System.out.println("Se encontraron: "+ total + " " + letra + " en " + palabra);
            return;
        }
        
        if(palabra.charAt(tamaño)==letra){
            total += 1;
        }
        tamaño +=1;
        muestraPalabra(tamaño);
    }
    
    
    /*private int numero; 
    
    
    public Recursividad(int num){
        numero = num;
    }*/
    
    /*public void muestraNumeros(int n){
        if (n==0){
                return;
            }
        System.out.println(n);
        if(n<0){
            muestraNumeros(n+1); 
        }else{  
            muestraNumeros(n-1);
        }
    }*/
    
    /*public int Factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*Factorial(n-1);       
        }
    }*/
    /*int total=0;
    public int Suma(int n){
        if(n==0){
            return 0;
        }
        return n+Suma(n-1);
        

    }*/
            
    
    
}
