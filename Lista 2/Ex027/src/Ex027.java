import java.util.Scanner;

// Uma fruteira está vendendo frutas com a seguinte tabela de preços:
//                       Até 5 Kg           Acima de 5 Kg
// Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
// Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg
// Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
// receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade 
// (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
public class Ex027 {
    public static void main(String[] args) throws Exception {
        double morango, maçã, preçoMorango, preoçoMaçã, preçoTotal;
        Scanner tc = new Scanner(System.in);
        System.out.println("Quantos Kg de morangos? ");
        morango = tc.nextDouble();
        System.out.println("Quantos Kg de maçãs?");
        maçã = tc.nextDouble();
        tc.close();
        if (morango <= 5) {
            preçoMorango = morango * 2.5;
        } else {
            preçoMorango = morango * 2.2;
        }
        if (maçã <= 5) {
            preoçoMaçã = maçã * 1.8;
        } else {
            preoçoMaçã = maçã * 1.5;
        }
        if (preoçoMaçã + preçoMorango > 25 || maçã + morango > 8) {
            preçoTotal = (preçoMorango + preoçoMaçã) * (1 - 0.10);
        } else {
            preçoTotal = preoçoMaçã + preçoMorango;
        }
        System.out.printf("O preço total a se pagar por " + maçã + " Kg de maçã e " + morango + " Kg de morango é de"
                + preçoTotal + " reais, com todos descontos.");
    }
}
