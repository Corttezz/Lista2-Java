import java.util.Scanner;

//Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda,
//que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 
//11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao 
//Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade 
//de horas trabalhadas no mês.
//Desconto do IR:
//Salário Bruto até 900 (inclusive) - isento
//Salário Bruto até 1500 (inclusive) - desconto de 5%
//Salário Bruto até 2500 (inclusive) - desconto de 10%
//Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo
public class Ex012 {
    public static void main(String[] args) throws Exception {
        double gainPerHour, hoursOfWorkMonth, salario, taxaIR, taxaFGTS, taxaSindicato, salarioLiquido;
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite seu ganho por hora:");
        gainPerHour = tc.nextDouble();
        System.out.println("Digite quantas horas você trabalha por mês: ");
        hoursOfWorkMonth = tc.nextDouble();
        tc.close();
        salario = gainPerHour * hoursOfWorkMonth;

        if (salario <= 900) {
            taxaIR = 0;
            taxaFGTS = salario * 0.11;
            taxaSindicato = salario * 0.03;
            salarioLiquido = salario - taxaFGTS - taxaIR - taxaSindicato;
            System.out.println("Seu salário é bruto é de: " + salario + " reais");
            System.out.println("Foi pago para o IR: " + taxaIR + " reais");
            System.out.println("Foi pago para o FGTS: " + taxaFGTS + " reais");
            System.out.println("Foi pago para o sindicato: " + taxaSindicato + " reais");
            System.out.println("Com os descontos, seu salário líquido é de: " + salarioLiquido + " reais");

        } else if (salario >= 900 && salario <= 1500) {
            taxaIR = salario * 0.05;
            taxaFGTS = salario * 0.11;
            taxaSindicato = salario * 0.03;
            salarioLiquido = salario - taxaFGTS - taxaIR - taxaSindicato;
            System.out.println("Seu salário é bruto é de: " + salario + " reais");
            System.out.println("Foi pago para o IR: " + taxaIR + " reais");
            System.out.println("Foi pago para o FGTS: " + taxaFGTS + " reais");
            System.out.println("Foi pago para o sindicato: " + taxaSindicato + " reais");
            System.out.println("Com os descontos, seu salário líquido é de: " + salarioLiquido + " reais");

        } else if (salario >= 1500 && salario <= 2500) {
            taxaIR = salario * 0.1;
            taxaFGTS = salario * 0.11;
            taxaSindicato = salario * 0.03;
            salarioLiquido = salario - taxaFGTS - taxaIR - taxaSindicato;
            System.out.println("Seu salário é bruto é de: " + salario + " reais");
            System.out.println("Foi pago para o IR: " + taxaIR + " reais");
            System.out.println("Foi pago para o FGTS: " + taxaFGTS + " reais");
            System.out.println("Foi pago para o sindicato: " + taxaSindicato + " reais");
            System.out.println("Com os descontos, seu salário líquido é de: " + salarioLiquido + " reais");

        } else if (salario >= 2500) {
            taxaIR = salario * 0.20;
            taxaFGTS = salario * 0.11;
            taxaSindicato = salario * 0.03;
            salarioLiquido = salario - taxaFGTS - taxaIR - taxaSindicato;
            System.out.println("Seu salário é bruto é de: " + salario + " reais");
            System.out.println("Foi pago para o IR: " + taxaIR + " reais");
            System.out.println("Foi pago para o FGTS: " + taxaFGTS + " reais");
            System.out.println("Foi pago para o sindicato: " + taxaSindicato + " reais");
            System.out.println("Com os descontos, seu salário líquido é de: " + salarioLiquido + " reais");
        }
    }
}