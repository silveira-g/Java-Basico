package edu.dio.Arrays;

import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
        //faça um programa que leia um vetor de consoantes de 6 caracters, e diga quantas consoantes foram lidas. imprima as consoates.
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6]; 
        int contador=0;

        for (int i = 0; i<consoantes.length; i++ ){ 
            System.out.println("Escreva uma letra");
            String letra = scan.next();
            if ( !(letra.equalsIgnoreCase("a")|| 
                (letra.equalsIgnoreCase("e")) ||
                (letra.equalsIgnoreCase("i")) ||
                (letra.equalsIgnoreCase("o")) ||
                (letra.equalsIgnoreCase("u")))) 
            consoantes[i] = letra;                      
        }
        for (String consoante : consoantes){
            System.out.print(consoante + " ");
        }
        scan.close();
    }
}
