
//Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular 
//a média alcançada por aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
//A mensagem "Aprovado com Distinção", se a média for igual a dez.
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) throws Exception {
        double nota1;
        double nota2;
        double media;
        System.out.println("Coloque as duas notas do aluno: ");
        Scanner tc = new Scanner(System.in);
        nota1 = tc.nextDouble();
        nota2 = tc.nextDouble();
        tc.close();
        media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("O aluno foi aprovado com distinção. Média de: " + media);
        } else if (media < 0 || media > 10) {
            System.out.println("Essa nota não existe.");
        } else if (media >= 7) {
            System.out.println("O aluno está aprovado. Média de: " + media);
        } else if (media < 7) {
            System.out.println("O aluno está reprovado. Média de: " + media);
        }
    }
}
