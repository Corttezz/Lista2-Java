import java.util.Scanner;
// Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
// "Telefonou para a vítima?"
// "Esteve no local do crime?"
// "Mora perto da vítima?"
// "Devia para a vítima?"
// "Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da
//  pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
//   entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

public class Ex025 {
    public static void main(String[] args) throws Exception {
        int culpado;
        String tel, local, mora, dever, trabalho;
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Telefonou para a vítima?");
        tel = tc.next();
        if("sim".equalsIgnoreCase(tel)){
            culpado= 1;
        }else{
            culpado= 0;
        }

        System.out.println("Esteve no local do crime?");
        local = tc.next();
        if("sim".equalsIgnoreCase(local)){
            culpado= culpado +1;
        }else{
            culpado= culpado +0;
        }  

        System.out.println("Mora perto da vítima?"); 
        mora = tc.next();
        if("sim".equalsIgnoreCase(mora)){
            culpado= culpado +1;
        }else{
            culpado= culpado +0;
        }  

        System.out.println("Devia para a vítima?");
        dever = tc.next();
        if("sim".equalsIgnoreCase(dever)){
            culpado= culpado +1;
        }else{
            culpado= culpado +0;
        }

        System.out.println("Já trabalhou com a vítima?");
        trabalho = tc.next();
        if("sim".equalsIgnoreCase(trabalho)){
            culpado= culpado +1;
        }else{
            culpado= culpado +0;
        }
        tc.close();
        if(culpado == 2){
            System.out.println("Suspeito.");
        }else if(culpado == 3 || culpado == 4){
            System.out.println("Cúmplice.");
        }else if(culpado == 5){
            System.out.println("Assassino.");
        }else{
            System.out.println("Inocente.");
        }
    }
}
