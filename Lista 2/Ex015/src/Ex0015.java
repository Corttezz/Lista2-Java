import java.util.Scanner;

//Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser 
//um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
//Dicas:
//Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
//Triângulo Equilátero: três lados iguais;
//Triângulo Isósceles: quaisquer dois lados iguais;
//Triângulo Escaleno: três lados diferentes;
public class Ex0015{
    public static void main(String[] args) throws Exception {
        int lado1, lado2, lado3;
        Scanner tc = new Scanner(System.in);
        lado1 = tc.nextInt();
        lado2 = tc.nextInt();
        lado3 = tc.nextInt();
        tc.close();

       if(lado1 + lado2> lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2){
        System.out.println("Valores válidos de um triângulo.");
        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("É um triângulo equilátero.");
           }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("É um triângulo isósceles.");
           }else if(lado1 != lado2 || lado1 != lado3 || lado2 != lado3){
            System.out.println("É um triângulo escaleno.");
           }
       }else{System.out.println("Valores não são válidos.");}
    }
}
