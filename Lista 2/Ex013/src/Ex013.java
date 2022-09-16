import java.util.Scanner;

//Faça um Programa que leia um número e exiba o dia correspondente da semana. 
//(1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
public class Ex013 {
    public static void main(String[] args) throws Exception {
        int numDia;
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o número do dia da semana.");
        numDia = tc.nextInt();
        tc.close();
        if(numDia  == 1){
            System.out.println("Domingo.");
        }
        if(numDia  == 2){
            System.out.println("Segunda.");
        }
        if(numDia  == 3){
            System.out.println("Terça.");
        }
        if(numDia  == 4){
            System.out.println("Quarta.");
        }
        if(numDia  == 5){
            System.out.println("Quinta.");
        }
        if(numDia  == 6){
            System.out.println("Sexta.");
        }
        if(numDia  == 7){
            System.out.println("Sábado.");
        }
    }
}
