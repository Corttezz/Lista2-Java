// Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo 
// (resto da divisão).

import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) throws Exception {
        int numero;
        System.out.print("Digite um número inteiro: ");
        Scanner tc = new Scanner(System.in);
        numero = tc.nextInt();
        tc.close();
        if(numero %2 == 0){
            System.out.println(numero + " é um número par.");
        }else{
            System.out.println(numero+" é um um número ímpar.");
        }
    }
}
