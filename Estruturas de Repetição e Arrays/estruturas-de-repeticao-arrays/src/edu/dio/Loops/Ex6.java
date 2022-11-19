package edu.dio.Loops;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        //Faça um programa que calcule o fatorial de um numero inteiro fonercido pelo usuario
        Scanner scan = new Scanner(System.in);
        int numero;
        int resultado = 0;
        System.out.println("Digite o numero para calcular o fatorial: ");
        numero = scan.nextInt();
        resultado = numero;
        for (int i=numero-1; i>1; i--){
            resultado*=i;
        }
        System.out.println("Fatorial do número: " + resultado);
        scan.close();
    }
}
