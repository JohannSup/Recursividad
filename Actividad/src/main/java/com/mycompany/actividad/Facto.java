
package com.mycompany.actividad;

import java.util.Scanner;

public class Facto {
    public static void main(String[] args) {
        Scanner objScanner= new Scanner(System.in);
        int num, total=0;
        System.out.println("Ingrese el número que desea calcular: ");
        num = objScanner.nextInt();
        System.out.println("El factorial es: "+mostrarNumero(num));
        mostrarNumero(num);
    }
    
    public static int mostrarNumero(int num){
        if(num == 0){
            System.out.println("");
            return 1;
        }else{
            
            return num * mostrarNumero(num-1);

        }
    }
}
