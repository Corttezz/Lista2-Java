import java.util.Scanner;
//As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram 
//para desenvolver o programa que calculará os reajustes.
//Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, 
//baseado no salário atual:
//salários até R$ 280,00 (incluindo) : aumento de 20%
//salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
//o salário antes do reajuste;
//o percentual de aumento aplicado;
//o valor do aumento;
//o novo salário, após o aumento.
public class App {
    public static void main(String[] args) throws Exception {
        int salario, aumentoReais, newSalario;
        System.out.println("Digite seu salário: ");
        Scanner tc = new Scanner(System.in);
        salario = tc.nextInt();
        tc.close();
        if (salario <= 280) {
            newSalario = (int) (salario * 1.2);
            aumentoReais = newSalario - salario;
            System.out.println("O salário que antes era: " + salario + " reais passou por um aumento de 20%" +
                    " e agora  é de: " + newSalario + " reais e teve um aumento de: " + aumentoReais + " reais.");
        } else if (salario >= 280 && salario <= 780) {
            newSalario = (int) (salario * 1.15);
            aumentoReais = newSalario - salario;
            System.out.println("O salário que antes era: " + salario + " reais passou por um aumento de 15%" +
                    " e agora  é de: " + newSalario + " reais e teve um aumento de: " + aumentoReais + " reais.");
        } else if (salario >= 700 && salario <= 1500) {
            newSalario = (int) (salario * 1.1);
            aumentoReais = newSalario - salario;
            System.out.println("O salário que antes era: " + salario + " reais passou por um aumento de 10%" +
                    " e agora  é de: " + newSalario + " reais e teve um aumento de: " + aumentoReais + " reais.");
        } else if (salario >= 1500) {
            newSalario = (int) (salario * 1.05);
            aumentoReais = newSalario - salario;
            System.out.println("O salário que antes era: " + salario + " reais passou por um aumento de 5%" +
                    " e agora  é de: " + newSalario + " reais e teve um aumento de: " + aumentoReais + " reais.");
        }
    }
}
