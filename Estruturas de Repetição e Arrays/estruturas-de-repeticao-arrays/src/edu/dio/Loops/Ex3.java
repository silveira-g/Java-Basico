package edu.dio.Loops;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        //faça um programa que solicite 5 numeros e mostre o maior numero digitado e a media deles
        Scanner scan = new Scanner(System.in);
        double media=0;
        int contador=0;
        double numero;
        double maior=-999999999;

        do {
            System.out.println("Insira um número: ");
            numero = scan.nextDouble();
            media +=numero;
            contador++;
            if(numero>maior){
                maior = numero;
            }
        }
        while (contador<5);
        media /= 5;
        System.out.println("Media: "+ media + " Maior numero: " + maior);
        scan.close();
    }
}
