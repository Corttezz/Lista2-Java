import java.util.Scanner;

//Faça um Programa que peça dois números e imprima o maior deles
class Ex001 {
  public static void main(String[] args) {
    double num1;
    double num2;
    double maior;

    System.out.println("Digite dois números:");
    Scanner tc = new Scanner(System.in);
    num1 = tc.nextDouble();
    num2 = tc.nextDouble();
    tc.close();

    if (num1 > num2) {
      maior = num1;
      System.out.println(maior + " É o maior numero");
    } else if (num2 > num1) {
      maior = num2;
      System.out.println(maior + " É o maior número");
    } else {
      System.out.println("Os números são iguais");
    }
  }
}