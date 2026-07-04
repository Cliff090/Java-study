import java.util.Scanner;

public class Main_exercicio {
    public static void main(String[] args) {
       // Scanner teclado = new Scanner(System.in);
       // System.out.println("Digite seu nome ");
       // String nome = teclado.nextLine();

        //System.out.println("Digite seu Rg ou CPF: ");
        //String Id = teclado.next();

         //System.out.println("Digite seu telefone para contato : ");
        //String tel = teclado.next();

       // System.out.println("insira seu e-mail");
       // String email = teclado.next();
       // teclado.close();
       // System.out.println("Nome:" + nome + "Cpf/RG: " + Id + "Telefone para contato: " + tel + "E-mail: " + email);



      //  Scanner teclado2 = new Scanner(System.in);
       // System.out.print("digite o número: ");
       // int numero1 = teclado2.nextInt();

       // System.out.print("digite o número: ");
        //int numero2 = teclado2.nextInt();
       // teclado2.close();

       // if (numero1 > numero2) {
        //    System.out.println("o maior é :" + numero1);
      //  } else if (numero1 < numero2) {
        //    System.out.println("o maior é : " + numero2);
       // } else
       //     System.out.print("São iguais ");

     Scanner teclado3= new Scanner(System.in);

     System.out.print("Digite o nome do produto: ");
             String name = teclado3.next();
     System.out.println("quantidade no estoque: ");
              int estoque= teclado3.nextInt();
     System.out.print("digite o preço unitário: ");
              int  precos = teclado3.nextInt();


        double total= estoque * precos ;
         if(total > 500 ){
             total = total * 0.85  ;
             System.out.printf("Valor total com %s: ", total);}
         else
             System.out.print("o valor a ser pago é "+ total );


          System.out.print("insira o valor necessário a ser pago: ");
                 double pagamento = teclado3.nextDouble();
          teclado3.close();
          if(pagamento>total) {
              double troco = pagamento - total;
              System.out.print("retire " + troco + "de troco ");
          }



         }
      }








