import java.util.Scanner;
// Um posto está vendendo combustíveis com a seguinte tabela de descontos:
// Álcool:
// até 20 litros, desconto de 3% por litro
// acima de 20 litros, desconto de 5% por litro
// Gasolina:
// até 20 litros, desconto de 4% por litro
// acima de 20 litros, desconto de 6% por litro 
// Escreva um algoritmo que leia 
// o número de litros vendidos, o tipo de combustível (codificado da seguinte
//  orma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo 
// cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do
// litro do álcool é R$ 1,90.
public class Ex026 {
    public static void main(String[] args) throws Exception {
        double litros, valorPago;
        String combustivel;
        Scanner tc = new Scanner(System.in);
        System.out.println("Quantos litros?");
        litros = tc.nextDouble();
        System.out.println("Qual combustivel?");
        combustivel = tc.next();
        tc.close();
        if ("a".equalsIgnoreCase(combustivel) && (litros <= 20)) {
            valorPago = litros * (1.90 * (1 - (3 / 100)));
            System.out.println("O valor de álcool a ser pago será de " + valorPago + " reais.");
        } else if ("a".equalsIgnoreCase(combustivel) && litros > 20) {
            valorPago = litros * (1.90 * (1 - (5 / 100)));
            System.out.println("O valor de álcool a ser pago será de " + valorPago + " reais.");
        } else if ("g".equalsIgnoreCase(combustivel) && (litros <= 20)) {
            valorPago = litros * (2.5 * (1 - (4 / 100)));
            System.out.println("O valor de gasolina a ser pago será de " + valorPago + " reais.");
        } else if ("g".equalsIgnoreCase(combustivel) && litros > 20){
            valorPago = litros * (2.5 * (1 - (6 / 100)));
            System.out.println("O valor de gasolina a ser pago será de " + valorPago + " reais.");
        }
    }
}
