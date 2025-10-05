package one.digitalinnovation.gof.strategy;

public class ComportamentoTriste implements Comportamento {

    @Override
    public void mover() {
        System.out.println("O robô está se movendo de forma muito lenta e desanimada...");
    }
}