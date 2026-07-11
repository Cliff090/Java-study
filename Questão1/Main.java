package Questão1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        Cliente cl = new Cliente();

        System.out.println("insira seu nome ");
        cl.setNome(sc.next());
        System.out.println("insira seu Rg:");
         cl.setRg(sc.next());
        System.out.println("insira seu cpf: ");
        cl.setCpf(sc.next());
        System.out.println("Agora telefone para contato: ");
        cl.setTelefone(sc.next());


        System.out.println("nome: "+ cl.getNome());
        System.out.println("rg: "+ cl.getRg());
        System.out.println("cpf: "+cl.getCpf());
        System.out.println("telefone para contato"+ cl.getTelefone());

        }
}
