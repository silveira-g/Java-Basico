package edu.dio.metodos;

public class Quadrilatero {
   public static void calcularQuadrilatero (double lado){
    System.out.println("Area do quadrado é " + (lado*lado));
   }
   public static void calcularQuadrilatero (double lado1, double lado2) {
      System.out.println("Area é " + ( lado1*lado2));
   }
   public static void calcularQuadrilatero(double baseMaior, double baseMenor, double altura){
      System.out.println(("Area é " + (((baseMaior+baseMenor)*altura))/2));
   }
}
