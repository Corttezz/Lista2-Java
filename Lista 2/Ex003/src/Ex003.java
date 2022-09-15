import java.util.Scanner;
//Faça um Programa que verifique se uma gender digitada é "F" ou "M". Conforme a 
//gender escrever: F - Feminino, M - Masculino, Sexo Inválido
public class Ex003 {
    public static void main(String[] args) {
        String gender;
        Scanner tc = new Scanner(System.in);
        System.out.println("Informe seu sexo - F/f(feminino) , M/m(masculino):");
        gender = tc.next();
        tc.close();

        if("m".equalsIgnoreCase(gender)){
            System.out.println("Sexo masculino!");
        }else if("f".equalsIgnoreCase(gender)){
            System.out.println("Sexo feminino!");
        }else{
            System.out.println("Sexo inválido!");
        }
     }}
    
