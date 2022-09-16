import java.util.Scanner;

//Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre,
//e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:public class App {
    public class Ex014 {
        public static void main(String[] args) throws Exception {
            double nota1, nota2, média;
            Scanner tc = new Scanner(System.in);
            System.out.println("Digite as duas notas do aluno: ");
            nota1 = tc.nextDouble();
            nota2 = tc.nextDouble();
            tc.close();
            média = (nota1+nota2)/2;
            if(média >= 9 && média <=10){
                System.out.println("Com a nota média de "+média+" o aluno é do conceito A.");
            }else if(média >= 7.5 && média <9){
                System.out.println("Com a nota média de "+média+" o aluno é do conceito B.");
            }else if(média >= 6 && média <7.5){
                System.out.println("Com a nota média de "+média+" o aluno é do conceito C.");
            }else if(média >= 4 && média <6){
                System.out.println("Com a nota média de "+média+" o aluno é do conceito D.");
            }else if(média >= 0 && média <4){
                System.out.println("Com a nota média de "+média+" o aluno é do conceito E.");
            }else{System.out.println("Nota inválida");}
        }
    }
