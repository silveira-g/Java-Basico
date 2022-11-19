package edu.dio.Arrays;
// crie um vetor de 6 numeros inteiros e mostreos na ordem inversa.
public class Ex1 {
    public static void main(String[] args) {
        int[] vetor = {6,5,4,3,2,1};
        int count = vetor.length-1;
        while (count >=0) {
            System.out.println(vetor[count]);
            count--;
        }   
    }
}
