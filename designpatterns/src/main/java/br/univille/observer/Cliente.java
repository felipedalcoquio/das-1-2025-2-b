package br.univille.observer;

public class Cliente {
    public static void main(String[] args) {
        //publicador
        var grupoFamilia = new Publisher();

        var zezinho = new ConcreteSubscribers();
        var huginho = new ConcreteSubscribers();
        var tia = new ConcreteSubscribers();

        //entrou no grupo da familia
        grupoFamilia.subscribe(zezinho);
        grupoFamilia.subscribe(huginho);
        grupoFamilia.subscribe(tia);

        grupoFamilia.setMainState("BOM DIAA");
        //botao enviar
        grupoFamilia.notifySubcribers();
    }  
}
