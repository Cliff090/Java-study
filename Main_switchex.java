import java.util.Scanner;

public class Main_switchex {
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner(System.in);
         do{
             System.out.println("escolha entre 1- consultar saldo, 2-depositar, 3-sacar 0-encerrar: ");
             int escolha= sc.nextInt();
             double saldo= 500;


             switch(escolha){
                 case 1:
                     System.out.println("Seu saldo é "+saldo);

                     break;
                 case 2:
                     System.out.print("Insira um valor válido: ");
                     saldo += sc.nextDouble();
                     System.out.printf("Seu saldo com o valor é:%2f" , saldo);
                     break;
                 case 3:
                     System.out.print("Insira um valor válido: ");
                     saldo -= sc.nextDouble();
                     if (saldo<0){
                         System.out.println("Saldo insuficiente");
                         break;
                     } break;
                     System.out.printf("Seu saldo com o valor é:%1f" , saldo);

                 case 0:
                     break;}
             System.out.print("Digite r para retornar : ");
             r= sc.next();}
              while(r.equalsIgnoreCase("r"));

         }








    }
