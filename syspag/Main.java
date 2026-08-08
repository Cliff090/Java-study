import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

        int opcoes;
        do{

            System.out.println("iniciar pagamento..");
            System.out.println("1- pagar com boleto");
            System.out.println("2- pagar com cartao ");
            System.out.println("3-pagar com pix ");
            System.out.println("0- sair");
            System.out.print("escolha: ");
             opcoes = sc.nextInt();
            switch(opcoes) {
                case 1:
                    PagamentoBoleto b = new PagamentoBoleto();
                    System.out.println("insira o valor a ser pago");
                    b.setValor(sc.nextDouble());
                    System.out.println("insira a data: ");
                    b.setData(sc.next());
                    System.out.println("codigo de barras: ");
                    b.setCodigoBarras(sc.next());
                    System.out.println("data de vencimento do boleto: ");
                    b.setDatavencimento(sc.next());


            }


        }while(opcoes!=0);

    }
