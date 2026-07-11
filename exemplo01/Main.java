package exemplo01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Carro c = new Carro();

    System.out.print("Insira a marca: ");
    c.setMarca(sc.next());
    System.out.print("insira o modelo: ");
    c.setModelo(sc.next());
    System.out.print("cor do veículo: ");
    c.setCor(sc.next());
    System.out.println("ano: ");
    c.setAno(sc.nextInt());


    c.ligar();
    c.acelerar();
    c.frear();
    c.desligar();
    sc.close();

    System.out.println("a marca: "+c.getMarca());
    System.out.println("modelo:"+c.getModelo());
    System.out.println("cor do veiculo: "+c.getCor());
    System.out.println("ano: "+c.getAno());}
}