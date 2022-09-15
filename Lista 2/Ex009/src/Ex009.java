import java.util.Scanner;

//Faça um Programa que leia três números e mostre-os em ordem decrescente.
public class Ex009 {
    public static void main(String[] args) throws Exception {
        double num1, num2, num3;
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite três números: ");
        num1 = tc.nextDouble();
        num2 = tc.nextDouble();
        num3 = tc.nextDouble();
        tc.close();
        if (num1 > num2 && num1 > 3 && num2 > num3) {
            System.out.println(num1 +" "+ num2 +" "+ num3);
        } else if (num1 > num2 && num1 > num3 && num3 > num2) {
            System.out.println(num1 +" "+ num3 +" "+ num2);
        } else if (num2 > num1 && num2 > num3 && num1 > num3) {
            System.out.println(num2 +" "+ num1 +" "+ num3);
        } else if (num2 > num1 && num2 > num3 && num3 > num1) {
            System.out.println(num2 +" "+ num3 +" "+ num1);
        } else if (num3 > num1 && num3 > num2 && num2 > num1) {
            System.out.println(num3 +" "+ num2 +" "+ num1);
        } else if (num3 > num1 && num3 > num2 && num1 > num2) {
            System.out.println(num3 +" "+ num1 +" "+ num2);
        }
    }
}
