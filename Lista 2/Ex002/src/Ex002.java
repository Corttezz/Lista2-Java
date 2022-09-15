import java.util.Scanner;

//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

class Ex002 {
  public static void main(String[] args) {
    double num1;

    System.out.println("Digite um número:");

    Scanner tc = new Scanner(System.in);
    num1 = tc.nextDouble();
    tc.close();

    if (num1 > 0) {
      System.out.println(num1 + " é positivo.");
    } else if (0 > num1) {
      System.out.println(num1 + " é negativo.");
    } else {
      System.out.println("O número é igual a zero.");
    }

  }
}