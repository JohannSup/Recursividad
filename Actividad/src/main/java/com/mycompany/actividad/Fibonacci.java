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
public class Fibonacci {

    public static void main(String[] args) {
        Scanner objScanner= new Scanner(System.in);
        int num;
        System.out.println("Ingrese el número que inicie la serie: ");
        num = objScanner.nextInt();
        System.out.println("El numero de serie al que pertenece es: "+Fibonacci(num));
    }

    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

}
