package edu.dio.Loops;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        //faça um programa que peça n numeros inteiros, calcule e mostre a quantidade de numeros pares e a quantidade de numeros impares
        Scanner scan = new Scanner(System.in);
        int quantidade;
        int numero;
        int quantidadePares=0;
        int quantidadeImpares=0;
        System.out.println("Digite a quantidade de numeros a serem inseridos: ");
        quantidade= scan.nextInt();

        for (int x=0; x<quantidade; x++){ 
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();
            if (numero%2==0)
                quantidadePares++;
            else 
                quantidadeImpares++;
        }
        System.out.println("Quantidade de pares: " + quantidadePares + " Quantidade de impares: " + quantidadeImpares);
        scan.close();
    }
}
