package Questão2;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();


        System.out.println("Nome do produto");
        p.setNome(sc.next());
        System.out.println("quantidade a ser comprada: ");
        p.setQuantidade(sc.nextInt());
        System.out.println("Informe o valor unitario: ");
        p.setPreçouni(sc.nextDouble());

       double valortotal = ((p.getPreçouni() * p.getQuantidade()));

       if (valortotal>500) {
            double desconto = valortotal * 0.85;
            System.out.println("o valor total é:"+ desconto );}
       else {
           System.out.println("o valor total é: "+ valortotal );
       }

       System.out.print("Digite o valor pago ");
        double valorpago = sc.nextDouble();

        if (valorpago>valortotal) {
            double troco = valorpago - valortotal;
            System.out.printf("retire %1f de troco", troco);
        } else if(valorpago<valortotal) {
            double restante = valortotal - valorpago;
            System.out.printf("ainda falta um valor: % 1f", restante);
        }
    }


}
