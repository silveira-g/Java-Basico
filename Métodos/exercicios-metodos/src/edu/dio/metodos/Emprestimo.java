package edu.dio.metodos;

public class Emprestimo {
    public static double getTaxaDuasParcelas(){
        return 0.15;
    }
    public static double getTaxaTresParcelas(){
        return 0.20;
    }

    public static void calcularEmprestimo(double valor, int parcelas){
        if (parcelas == 2) {
            System.out.println("Valor final do emprestimo: " + (valor + valor* (getTaxaDuasParcelas())));
        } else if (parcelas == 3) {
            System.out.println("Valor final do emprestimo: " + (valor + valor* (getTaxaTresParcelas())));
        } else {
            System.out.println("Numero de parcelas invalido");
        }
    }
}
