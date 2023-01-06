/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menubank;

/**
 *
 * @author renan
 */
import java.util.Scanner;
public class MenuBank {


   public static void main (String[]args){
      Scanner sc = new Scanner(System.in);
      int opcao=0;
      float soma=0, valor=0;
   do{
    System.out.println("***** M E N U  B A N C O *****");
    System.out.println("SALDO [1]" ); 
    System.out.println("SAQUE [2]" ); 
    System.out.println("DEPOSITO [3]"); 
    System.out.println("SAIR [4]" );
    System.out.println("\nEscolha uma OPCAO: "); 
    opcao = sc.nextInt();
    
        switch(opcao){
            case 1:
               System.out.printf("Saldo atual R$%.2f\n\n", soma);
               System.out.println();
               break;
            case 2:
               System.out.println("Informe o valor para SAQUE:");
               valor= sc.nextFloat();
               soma -= valor;
                System.out.println();
               break;
            case 3:
               System.out.println("Informe o valor do DEPOSITO:");
               valor= sc.nextFloat();
               soma += valor;
               System.out.println();
               break;
            case 4:
               System.out.println("SAINDO....." );
               break;
            default:
               System.out.println("OPCAO INVALIDA !!\n");
        }
    }while(opcao != 4);
    System.out.println("\nFIM das operacoes !"); 
    }
}

