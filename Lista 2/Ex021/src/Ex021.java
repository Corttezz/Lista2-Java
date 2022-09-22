import java.util.Scanner;


//Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois 
//informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina.
//Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, 
//uma nota de 5 e uma nota de 1;
//Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50,
//quatro notas de 10, uma nota de 5 e quatro notas de 1.
public class Ex021 {
    public static void main(String[] args) throws Exception {
        int saque, nota1, nota5, nota10, nota50, nota100;
        String nota100str, nota50str, nota10str, nota5str, nota1str;
        Scanner tc = new Scanner(System.in);
        System.out.println("Qual o valor do saque?");
        saque = tc.nextInt();
        tc.close();
        nota100 =  (int) Math.floor(saque/100);
        nota50 = (int) Math.floor((saque - (nota100*100))/50);
        nota10= (int) Math.floor((saque - ((nota100*100) + (nota50 * 50)))/10);
        nota5= (int) Math.floor((saque -((nota100*100) + (nota50 * 50) + (nota10 * 10)))/5);
        nota1 = (int) Math.floor((saque -((nota100*100) + (nota50 * 50) + (nota10 * 10) + (nota5*5)))/1);
      

        if(nota100 == 0){
            nota100str= "";
        }
        else if(nota100==1){
             nota100str = " uma nota de 100 reais, ";
        }else{
             nota100str = nota100+" notas de 100 reais, ";
        }
        if(nota50 == 0){
            nota50str= "";
        }
        else if(nota50==1){
             nota50str = " uma nota de 50 reais, ";
        }else{
             nota50str = nota50+" notas de 50 reais, ";
        }

        if(nota10 == 0){
            nota10str= "";
        }
        else if(nota10==1){
             nota10str = " uma nota de 10 reais, ";
        }else{
             nota10str = nota10+" notas de 10 reais, ";
        }
        if(nota5 == 0){
            nota5str= "";
        }
        else if(nota5==1){
             nota5str = " uma nota de 5 reais, ";
        }else{
             nota5str = nota5+" notas de 5 reais, ";
        }
        if(nota1 == 0){
            nota1str= "";
        }
        else if(nota1==1){
             nota1str = " moedas de 1 real.";
        }else{
             nota1str = nota1+" moedas de 1 real.";
        }
        System.out.println(nota100str + nota50str + nota10str + nota5str + nota1str);
       }
    }

