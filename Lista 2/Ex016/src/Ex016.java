//Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa 
//deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
//Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer
//pedir os demais valores, sendo encerrado;
//Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
//Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
//Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
import java.util.Scanner;
import java.lang.Math;
public class Ex016 {

    public static void main(String[] args) throws Exception {
        int a, b, c, delta;
        double raiz1, raiz2;

        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        a = tc.nextInt();
        System.out.print("Digite o valor de b: ");
        b = tc.nextInt();
        System.out.print("Digite o valor de c: ");
        c = tc.nextInt();
        tc.close();

        delta = (int) (Math.pow(b, 2)- 4* a * c);
        
        if(delta < 0){
            System.out.println("A equação não possui raízes.");
        }else if(delta == 0){
            raiz1 = (int) (-b + Math.sqrt(delta))/2*a;
            System.out.println("Como o delta é igual a 0, a equação só possui uma raiz: "+ raiz1);
        }else if(delta > 0){
           raiz1 = (-(b) + Math.sqrt(delta))/(2*a);
           raiz2 = (-(b) - Math.sqrt(delta))/(2*a);
            System.out.println("Como o delta é maior que zero, a equação tem duas raízes: "+raiz1+" e "+raiz2);
        }
    }
}
