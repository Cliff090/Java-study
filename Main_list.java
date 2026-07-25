import java.util.ArrayList;
import java.util.Scanner;

public class Main_list {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Carro_list> carroLists = new ArrayList<>();

    System.out.println("Quantos no cadastro: ");
    int qtds = sc.nextInt();

    for (int i = 0; i < qtds; i++ ) {
        Carro_list c = new Carro_list();
        c.setId(i+1);
        System.out.println("Marca: ");
        c.setMarca(sc.next());
        System.out.println("Modelo: ");
        c.setModelo(sc.next());
        System.out.println("Velocidade: ");
        c.setVelocidade(sc.nextInt());
        System.out.println("Cor");
        c.setCor(sc.next());
        carroLists.add(c);
        System.out.println(c);
        }


    for(Carro_list c: carroLists) {
            System.out.println("ID: " + c.getId());
            System.out.println("Marca: " + c.getMarca());
            System.out.println("Modelo: " + c.getModelo());
            System.out.println("Cor:"+ c.getCor());
            System.out.println("Velocidade: " + c.getVelocidade());
    }

   System.out.println("Digite 1 para remover um carro, digite 2 para atualizar");
    int x = sc.nextInt();
     switch(x) {
         case 1:
             System.out.print("Digite o ID do carro que você deseja retirar: ");
             int removerIndice = sc.nextInt() - 1;
             if (removerIndice >= 0 && removerIndice < carroLists.size()) {
                 carroLists.remove(removerIndice);
                 for (int i = 0; i < carroLists.size(); i++) {
                     carroLists.get(i).setId(i + 1);
                     System.out.println("Carro removido com sucesso");
                 }
             } else {
                 System.out.println("Indice invalido, tente novamente");
                 break;}
              System.out.print(carroLists);
               break;
         case 2:




     }

     }

     }







