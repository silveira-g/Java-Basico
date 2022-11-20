package edu.dio.metodos;

public class Calculadora {
    public static void soma (double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("A soma é " + resultado);
    }

    public static void subtracao (double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("A subtracao é " + resultado);
    }

    public static void multiplicacao (double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("A multiplica é " + resultado);
    }

    public static void divisao (double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("A divisao é " + resultado);
    }
}
