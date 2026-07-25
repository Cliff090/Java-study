import java.util.Scanner;
import java.util.ArrayList;
public class Main_client_sys {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Clientes_sys> clientes = new ArrayList<>();

        System.out.println("Quantos no cadastro: ");
        int qtds = sc.nextInt();

        for(int i=0; i< qtds; i++){
           Clientes_sys c = new Clientes_sys();
           c.setId(i+1);
           System.out.println("Nome:");
            c.setNome(sc.next());
            System.out.println("Rg: ");
            c.setRg(sc.next());
            System.out.println("Cpf: ");
            c.setCpf(sc.next());
            System.out.println("Telefone: ");
            c.setTelefone(sc.next());
            System.out.println("E-mail: ");
            c.setEmail(sc.next());
            clientes.add(c);
            System.out.println(c);
        }

        System.out.println("Digite 1 para remover um cliente, digite 2 para atualizar");
        int x = sc.nextInt();
        switch(x) {
            case 1:
                System.out.print("Digite o ID do cliente que você deseja retirar: ");
                int removerIndice = sc.nextInt() - 1;
                if (removerIndice >= 0 && removerIndice < clientes.size()) {
                    clientes.remove(removerIndice);
                    for (int i = 0; i < clientes.size(); i++) {
                        clientes.get(i).setId(i + 1);
                        System.out.println("Cliente removido com sucesso");
                    }
                } else {
                    System.out.println("Indice invalido, tente novamente");
                    break;}
                System.out.print(clientes);
                break;
                case 2:
                    System.out.print("Digite o ID do cliente que deseja atualizar: ");
                    int updateIndice = sc.nextInt() -1;

                    if(updateIndice>=0  && updateIndice< clientes.size()){
                        Clientes_sys c = clientes.get(updateIndice);
                        System.out.print("Nome:");
                        c.setNome(sc.next());
                        System.out.println("Rg: ");
                        c.setRg(sc.next());
                        System.out.println("Cpf: ");
                        c.setCpf(sc.next());
                        System.out.println("Telefone: ");
                        c.setTelefone(sc.next());
                        System.out.println("E-mail: ");
                        c.setEmail(sc.next());
                        break;
                    }else{
                        System.out.print("indice invalido");
                        break;
                    }




        }
     sc.close();
    }
}