import java.util.Scanner;

// Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas,
// dezenas e unidades do mesmo.
// Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
// 326 = 3 centenas, 2 dezenas e 6 unidades
// 12 = 1 dezena e 2 unidades 
public class App {
    public static void main(String[] args) throws Exception {
        int num, centenas, dezenas, unidades;
        String escritaCentenas, escritaDezenas, escritaUnidades;
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite um número menor que 1000: ");
        num = tc.nextInt();
        tc.close();
        if (num < 1000) {
            centenas = (int) Math.ceil(num / 100);
            dezenas = (int) Math.ceil((num - (centenas * 100)) / 10);
            unidades = num - (centenas * 100 + dezenas * 10);
            if (centenas == 1) {
                escritaCentenas = "centena";
            } else {
                escritaCentenas = "centenas";
            }
            if (dezenas == 1) {
                escritaDezenas = "dezena";
            } else {
                escritaDezenas = "dezenas";
            }
            if (unidades == 1) {
                escritaUnidades = "unidade";
            } else {
                escritaUnidades = "unidades";
            }
            System.out.println(centenas + " " + escritaCentenas + ", " + dezenas + " " + escritaDezenas + " e " + unidades
                    + " " + escritaUnidades + ".");

                    String strCent = Integer.toString(centenas);
                    String strDez = Integer.toString(dezenas);
                    String strUni = Integer.toString(unidades);


            System.out.println(strCent + " " + escritaCentenas + ", " + strDez + " " + escritaDezenas + " e " + strUni
            + " " + escritaUnidades + ".");

        } else {
            System.out.println("Número maior ou igual a 1000.");
        }
    }}
