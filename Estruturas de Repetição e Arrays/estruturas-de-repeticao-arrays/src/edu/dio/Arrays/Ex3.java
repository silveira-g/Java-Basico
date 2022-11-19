package edu.dio.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        //faça um vetor de 20 elementos que leia numeros aleatorios entre 0 e 100. ao final mostre os numeros e seus sucessores.
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[20];
        Random random = new Random();
        for (int i=0; i<vetor.length; i++) {
            int numero = random.nextInt(100);
            vetor[i] = numero;
            }
        
        System.out.println("Vetor: ");
        for (int x : vetor) {
            System.out.print(x + (" "));
        }
        System.out.println("\nNumeros Sucessores: ");
        for (int i : vetor) {
            System.out.print((i+1) + (" "));
        }
        scan.close();
    }
}
