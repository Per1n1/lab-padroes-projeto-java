package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.ComportamentoTriste; // <--- NOVO IMPORT
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

    public static void main(String[] args) {
        
        // --- 1. Singleton ---
        System.out.println("----- TESTE PADRÃO SINGLETON -----");
        
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        
        // --- 2. Strategy ---
        System.out.println("\n----- TESTE PADRÃO STRATEGY -----");
        
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento triste = new ComportamentoTriste(); // <--- NOVO COMPORTAMENTO
        
        Robo robo = new Robo();
        
        System.out.println("Comportamento Normal:");
        robo.setComportamento(normal);
        robo.mover();
        
        System.out.println("\nComportamento Defensivo:");
        robo.setComportamento(defensivo);
        robo.mover();
        
        System.out.println("\nComportamento Triste:");
        robo.setComportamento(triste); // <--- TESTANDO O NOVO COMPORTAMENTO
        robo.mover();
        
        System.out.println("\nComportamento Agressivo:");
        robo.setComportamento(agressivo);
        robo.mover();
        
        // --- 3. Facade ---
        System.out.println("\n----- TESTE PADRÃO FACADE -----");
        
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");
    }

}