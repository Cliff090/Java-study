import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

import static java.time.LocalDate.parse;
import static java.time.chrono.ChronoLocalDate.timeLineOrder;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Usuario u = new Usuario(){};
        int opcao;
        System.out.println("Login inicial");
        System.out.println("id");
        u.setId(sc.nextLong());
        System.out.println("nome");
        u.setNome(sc.next());
        System.out.println("senha");
        u.setSenha(sc.next());
        System.out.println("E-mail");
        u.setEmail(sc.next());
        System.out.println("-----------------------------------");
        System.out.println("deseja adquirir premium?(digite 1 se sim, 2 se não");
        int resposta = sc.nextInt();
        if (resposta== 1){
            UsuarioPremium p = new UsuarioPremium();
            System.out.println("digite a data de começo do plano: ");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date data = sdf.get2DigitYearStart(); parse(sc.next());
            p.setIniciodopremium(data);
            p.ativarpremium(p.getIniciodopremium());
        }
        u.visualizardados();
        u.visualizarperfis();
        CommonUser co = new CommonUser();
        co.visualizarconteudo();




        do{
            System.out.println("---------BEM VINDO--------------");
            System.out.println("escolha uma das opçoes ");
            System.out.println("1- configuraçoes de criadores de conteudo");
            System.out.println("2- configuraçoes de empresas");
            System.out.println("0- sair ");
            System.out.println("-------------------------------");
            opcao = sc.nextInt();
             switch (opcao){
                 case 1:
                    int criador;
                    do {
                        System.out.println("informe o que voce é, 1 para influencer, 2 para fotografo, 3, para Streamer, 0 pra voltar");
                        criador = sc.nextInt();
                        switch (criador){
                            case 1:
                                Influenciador i= new Influenciador();
                                System.out.println("informe o nicho");
                                i.setNicho(sc.next());
                                System.out.println("Obrigado por escolher nossa plataforma");
                                System.out.println(u.toString());
                                break;
                            case 2:
                                Fotografo f = new Fotografo();
                                System.out.println("informe sua especialidade");
                                f.setEspecialidade(sc.next());
                                System.out.println(u.toString());
                                break;
                            case 3:
                                Streamer s = new Streamer();
                                System.out.println("informe sua plataforma");
                                s.setPlataforma(sc.next());
                                break;
                        }
                    }while(criador!=0);
                 case 2:
                     Empresa e = new Empresa();
                     System.out.println("informe o cnpj");
                     e.setCnpj(sc.next());
                     System.out.println("informe razao social");
                     e.setRazaosocial(sc.next());
                     System.out.println("digite 1 se desejar entrar na area de empresa verificada:");
                     int escolha = sc.nextInt();
                     if (escolha==1){
                         System.out.println(timeLineOrder());
                     }break;



             }
        } while(opcao!= 0);
        }
    }
