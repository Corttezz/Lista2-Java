import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) throws Exception {
        int ano;
        System.out.print("Digite um ano: ");
        Scanner tc = new Scanner(System.in);
        ano = tc.nextInt();
        tc.close();
        if (ano % 100 == 0 && ano % 400 == 0) {
            System.out.println("Ano bissexto");
        } else if (ano % 100 == 0 && ano % 400 != 0) {
            System.out.println("Ano não bissexto.");
        } else if (ano % 4 == 0) {
            System.out.println("Ano bissexto.");
        } else {
            System.out.println("Ano não bissexto.");
        }
    }
}
