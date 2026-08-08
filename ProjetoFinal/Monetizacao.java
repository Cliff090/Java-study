public interface Monetizacao {


    public default Boolean ativarmonetizar(Boolean premium) {
        boolean monetizacao = false;
        if (monetizacao) {
            System.out.println("Sua monetização esta ativada");
            return monetizacao = true;
        } else {
            System.out.println("Você ja possui a monetização ativa");
            return null;

        }
    }

    public default void desativarmonetizacao() {
        if (ativarmonetizar(true)) {
            System.out.println("sua monetização foi desativada");

        }
    }

    }

