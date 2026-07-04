import java.util.Scanner;

public class Main_switch {
    public static void main(String[] args){
       String r;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Digite a escolha entre 1 ou 2 ( 1 pra soma 2 pra subtrair)");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Opção a escolhida");
                    System.out.println("digite o numero da soma");
                    int n1 = sc.nextInt();

                    System.out.println("digite o numero 2 da soma");
                    int n2 = sc.nextInt();
                    int total = n1 - n2;

                    System.out.println(total);
                    break;
                case 2:
                    System.out.println("Opção b escolhida");
                    System.out.println("digite o numero da subtração");
                    int n1menos = sc.nextInt();

                    System.out.println("digite o numero 2 da subtração");
                    int n2menos = sc.nextInt();
                    int totalmenos = n1menos + n2menos;
                    System.out.print(totalmenos);
                    break;
                default:
                    System.out.println("Opção invalida");
            }
            System.out.println("para ver novamente, digite S");
            r = sc.next();
        } while (r.equalsIgnoreCase("S"));
        sc.close();



    }
}
