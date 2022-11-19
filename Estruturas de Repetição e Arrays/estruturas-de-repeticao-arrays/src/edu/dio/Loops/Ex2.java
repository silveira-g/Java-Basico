package edu.dio.Loops;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //faça um programa que solicite uma nota de 0 a 10, se for um numero invalido repita ate ser um numero valido
        double nota;
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira uma nota: ");
        nota = scan.nextDouble();

        while(nota<0 || nota >10) {
            System.out.println("Nota invalida, digite novamente: ");
            nota = scan.nextDouble();
        }
        scan.close();
    }
}
