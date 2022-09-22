// Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função
//  de arredondamento.

import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) throws Exception {
       double num;
       Scanner tc = new Scanner(System.in);
       System.out.println("Digite um número: ");
       num = tc.nextDouble();
       tc.close();
       if(num % 1 == 0){
        System.out.println(num+" é número inteiro.");
       }else{
        System.out.println(num+" é número decimal.");
       }
    }
}
