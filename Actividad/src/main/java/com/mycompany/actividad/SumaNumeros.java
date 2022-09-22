package com.mycompany.actividad;

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner objScanner= new Scanner(System.in);
        int num, suma=0;
        System.out.println("Ingrese el número que desea sumar: ");
        num = objScanner.nextInt();
        System.out.println("El total es: "+sumaNumero(num));
        sumaNumero(num);
    }    
    
    public static int sumaNumero(int num){
        int suma;
        if(num==0){
            System.out.println("");
            return 0;
        }else{
            return num + sumaNumero(num-1);
        }
    }
}
