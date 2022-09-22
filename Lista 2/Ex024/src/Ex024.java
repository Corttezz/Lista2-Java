
// Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.
//  O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
// par ou ímpar;
// positivo ou negativo;
// inteiro ou decimal.
import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) throws Exception {
        double num1, num2, resultado;
        String op;
        System.out.println("Digite dois números da operação: ");
        Scanner tc = new Scanner(System.in);
        num1 = tc.nextDouble();
        num2 = tc.nextDouble();
        System.out.println("Digite o sinal da operação deseja fazer?");
        op = tc.next();
        tc.close();

        if ("+".equalsIgnoreCase(op)){
            resultado = num1 + num2;
            System.out.println("O resultado da operação é de: "+resultado);
            if (resultado % 1 == 0) {
                System.out.println(resultado + " é número inteiro.");
            } else {
                System.out.println(resultado + " é número decimal.");
            }if (resultado % 2 == 0) {
                System.out.println(resultado + " é um número par.");
            } else {
                System.out.println(resultado + " é um um número ímpar.");
            }if(resultado > 0){
                System.out.println(resultado+ " é um número positivo");
            }else{
                System.out.println(resultado+ " é um numero negativo");
            }
        } else if ("-".equalsIgnoreCase(op)) {
            resultado = num1 - num2;
            System.out.println("O resultado da operação é de: "+resultado);
            if (resultado % 1 == 0) {
                System.out.println(resultado + " é número inteiro.");
            } else {
                System.out.println(resultado + " é número decimal.");
            }if (resultado % 2 == 0) {
                System.out.println(resultado + " é um número par.");
            } else {
                System.out.println(resultado + " é um um número ímpar.");
            }if(resultado > 0){
                System.out.println(resultado+ " é um número positivo");
            }else{
                System.out.println(resultado+ " é um numero negativo");
            }
        } else if ("*".equalsIgnoreCase(op)|| "x".equalsIgnoreCase(op)) {
            resultado = num1 * num2;
            System.out.println("O resultado da operação é de: "+resultado);
            if (resultado % 1 == 0) {
                System.out.println(resultado + " é número inteiro.");
            } else {
                System.out.println(resultado + " é número decimal.");
            }if (resultado % 2 == 0) {
                System.out.println(resultado + " é um número par.");
            } else {
                System.out.println(resultado + " é um um número ímpar.");
            }if(resultado > 0){
                System.out.println(resultado+ " é um número positivo");
            }else{
                System.out.println(resultado+ " é um numero negativo");
            }
        } else if ("/".equalsIgnoreCase(op) || ":".equalsIgnoreCase(op)) {
            resultado = num1 / num2;
            System.out.println("O resultado da operação é de: "+resultado);
            if (resultado % 1 == 0) {
                System.out.println(resultado + " é número inteiro.");
            } else {
                System.out.println(resultado + " é número decimal.");
            }if (resultado % 2 == 0) {
                System.out.println(resultado + " é um número par.");
            } else {
                System.out.println(resultado + " é um um número ímpar.");
            }if(resultado > 0){
                System.out.println(resultado+ " é um número positivo");
            }else{
                System.out.println(resultado+ " é um numero negativo");
            }
        }
    }
}
