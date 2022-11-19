package edu.dio.Arrays;

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        //gere uma matriz de ordem 4 e a imprima com numeros aleatorios entre 0 e 9.
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for (int i = 0; i<matriz.length; i++ ){ 
            for (int j = 0; j<matriz[i].length; j++ ){ 
                int numero = random.nextInt(9);
                matriz[i][j]=numero;
            }
        }
        System.out.println("Matriz: ");
        for (int [] linha : matriz) {
            for (int elementoColuna : linha) {
                System.out.print(elementoColuna);
            }
            System.out.println();
        }
    }
}
