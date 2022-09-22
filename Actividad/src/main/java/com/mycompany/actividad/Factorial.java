
package com.mycompany.actividad;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner objScanner= new Scanner(System.in);
        int num, total=0;
        System.out.println("Ingrese el número que desea calcular: ");
        num = objScanner.nextInt();
        mostrarNumero(num);
    }
    
    public static int mostrarNumero(int num){
        if(num == 0){
            System.out.println("");
            return 1;
        }else{
            System.out.println(num-1);
            return num * mostrarNumero(num-1);
            
        }
    }
}
