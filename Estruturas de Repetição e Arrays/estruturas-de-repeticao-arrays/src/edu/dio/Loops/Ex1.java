package edu.dio.Loops;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
      do {
        System.out.println(("Digite o nome: "));
        nome = scanner.next();
        System.out.println("Digite a idade: ");
        idade = scanner.nextInt();
      } while (!nome.equals("0"));

        scanner.close();
    }
}
