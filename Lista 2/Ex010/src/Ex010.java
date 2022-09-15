import java.util.Scanner;
// Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou
//V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou 
// "Valor Inválido!", conforme o caso.
public class Ex010 {
    public static void main(String[] args) throws Exception {
        String turno;
        Scanner tc = new Scanner(System.in);
        System.out.println("Em qual turno você estuda? Digite M para matutino, V paraVespertino e N para Noturno.");
        turno = tc.next();
        tc.close();
        if ("v".equalsIgnoreCase(turno)) {
            System.out.println("Turno vespertino.");
        } else if ("m".equalsIgnoreCase(turno)) {
            System.out.println("Turno matutino.");
        }
        if ("v".equalsIgnoreCase(turno)) {
            System.out.println("Turno vespertino.");
        }
        if ("n".equalsIgnoreCase(turno)) {
            System.out.println("Turno noturno.");
        }
    }
}
