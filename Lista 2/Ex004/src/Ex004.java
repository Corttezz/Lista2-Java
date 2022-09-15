import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

public class Ex004 {
    public static void main(String[] args) throws Exception {
        String letra;
        System.out.println("Digite uma letra:");
        Scanner tc = new Scanner(System.in);
        letra = tc.next();
        tc.close();
        if("a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra) ||
        "o".equalsIgnoreCase(letra) || "u".equalsIgnoreCase(letra)){
            System.out.println("Vogal");
        }else{
            System.out.println("Consoante!");
        }
    }
}
