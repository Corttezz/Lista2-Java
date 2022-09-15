import java.util.Scanner;

//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, 
//sabendo que a decisão é sempre pelo mais barato.
public class Ex008 {
    public static void main(String[] args) throws Exception {
        double produto1, produto2, produto3;
        Scanner tc = new Scanner(System.in);
        System.out.println("Qual o preço do primeiro produto?");
        produto1 = tc.nextDouble();
        System.out.println("Qual o preço do segundo produto?");
        produto2 = tc.nextDouble();
        System.out.println("Qual o preço do terceiro produto?");
        produto3 = tc.nextDouble();
        tc.close();

        if(produto1 < produto2 && produto1 < produto3){
            System.out.println("Compre o primeiro produto.");
        }else if(produto2 < produto1 && produto2 < produto3){
            System.out.println("Compre o segundo produto.");
        }else if(produto3< produto1 && produto3 < produto2){
            System.out.println("Compre o terceiro produto.");
        }else if(produto1 == produto2 && produto1 == produto3){
            System.out.println("Compre qualquer produto.");
        }
    }
}
