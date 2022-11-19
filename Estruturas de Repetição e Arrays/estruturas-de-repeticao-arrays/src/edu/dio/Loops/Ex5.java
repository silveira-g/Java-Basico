package edu.dio.Loops;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        //faça um gerador de tabuada de 1 a 10 em que o usuario escolha qual o numero da tabuada para ser calculada. A tabuada deve apresentar de forma: 5 x 1 = 5...
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("Insira um numero para a tabuada: ");
        numero = scan.nextInt();
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <=10; i++){
            System.out.println(numero + " X " + i + " = " + (numero*i));
        }
        scan.close();
    }
}
