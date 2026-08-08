import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<>();
        ArrayList<Bicicleta> bikes = new ArrayList<>();
        ArrayList<Aviao> avioes = new ArrayList<>();

        int opcao;
        do {
            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Cadastrar Avião");
            System.out.println("3 - Cadastrar Bicicleta");
            System.out.println("4 - Mostrar veículos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    Carro c = new Carro();
                    System.out.print("Marca: ");
                    c.setMarca(sc.next());
                    System.out.print("Modelo: ");
                    c.setModelo(sc.next());
                    System.out.print("Cor: ");
                    c.setCor(sc.next());
                    System.out.print("Placa: ");
                    c.setPlaca(sc.next());
                    System.out.print("Portas: ");
                    c.setPortas(sc.nextInt());
                    carros.add(c);
                    break;
                case 2:
                    Aviao a = new Aviao();
                    System.out.print("Marca");
                    a.setMarca(sc.next());
                    System.out.print("Modelo");
                    a.setModelo(sc.next());
                    System.out.print("Altitude maxima: ");
                    a.setAltitudemx(sc.nextInt());
                    System.out.print("capacidade de passageiros: ");
                    a.setCapacidade_passageiros(sc.nextInt());
                    avioes.add(a);
                    a.ligar();

                    break;
                case 3:
                    Bicicleta b = new Bicicleta();
                    System.out.print("Marca: ");
                    b.setMarca(sc.next());
                    System.out.print("Modelo: ");
                    b.setModelo(sc.next());
                    System.out.print("Marchas: ");
                    b.setMarchas(sc.nextInt());
                    System.out.print("possui cesta(true ou false): ");
                    b.setPossuiCesta(sc.nextBoolean());
                    System.out.print("tipo freio: ");
                    b.setFreio(sc.next());
                    bikes.add(b);
                    break;


                case 4:
                    System.out.print(carros);
                    System.out.println(bikes);
                    System.out.println(avioes);


            }

        } while (opcao != 0);

        int opcao2;



    }


    }
