public interface Motorizado {
    public default void ligar() {
        System.out.println("veiculo ligado");
    }

    public default void desligar() {
        System.out.println("veiculo desligado");

    }
}
