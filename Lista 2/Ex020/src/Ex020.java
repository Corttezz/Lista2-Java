//Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por 
//aluno e presentar:
//A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
//A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
//A mensagem "Aprovado com Distinção", se a média for igual a 10.
import java.util.Scanner;
public class Ex020 {
    public static void main(String[] args) throws Exception {
        double nota1;
        double nota2;
        double nota3;
        double media;
        System.out.println("Coloque as três notas do aluno: ");
        Scanner tc = new Scanner(System.in);
        nota1 = tc.nextDouble();
        nota2 = tc.nextDouble();
        nota3 = tc.nextDouble();
        tc.close();
        media = (nota1 + nota2+ nota3) / 3;

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

