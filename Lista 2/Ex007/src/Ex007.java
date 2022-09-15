
//Faça um Programa que leia três números e mostre o maior e o menor deles
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) throws Exception {
        double num1, num2, num3;
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite três números: ");
        num1 = tc.nextDouble();
        num2 = tc.nextDouble();
        num3 = tc.nextDouble();
        tc.close();
        // mostrar o maior
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " é o maior número.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " é o maior número.");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " é o maior número.");
        } else {
            System.out.println("Não temos um número maior.");
        }
        // mostrar o menor
        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + " é o menor número.");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println(num2 + " é o menor número.");
        } else if (num3 < num2 && num3 < num1) {
            System.out.println(num3 + " é o menor número.");
        }else{System.out.println("Não temos um número menor.");}
    }
}
