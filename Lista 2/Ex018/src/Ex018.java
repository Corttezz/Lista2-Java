
import java.util.Scanner;

//Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
public class Ex018 {
    public static void main(String[] args) throws Exception {
        int dia, mes, ano;
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        dia = tc.nextInt();
        System.out.print("Digite o mês: ");
        mes = tc.nextInt();
        System.out.print("Digite o ano: ");
        ano = tc.nextInt();
        tc.close();
        if(dia > 0 && dia <= 31 && mes > 0 && mes <= 12){
            if(mes == 4 || mes == 6 || mes == 9 || mes == 11  && dia > 30){
                System.out.println("Data inválida.");
            } else if (ano % 100 == 0 && ano % 400 == 0 && mes == 2 && dia >29) {
                System.out.println("Data inválida");
            } else if (ano % 100 == 0 && ano % 400 != 0 && mes == 2 && dia > 28) {
                System.out.println("Data inválida");
            } else if (ano % 4 == 0 && mes == 2 && dia > 29) {
                System.out.println("Data inválida");
            } else{System.out.println("Data válida.");}
        }else{System.out.println("Data inválida.");}
    }
}
