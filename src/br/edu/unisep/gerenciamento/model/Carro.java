package br.edu.unisep.gerenciamento.model;

public class Carro extends Veiculo {
    int numeroPortas;
    boolean temArCondicionado;

    public Carro(String marca, String modelo, int anoFabricacao, int numeroPortas, boolean temArCondicionado) {
        super(marca, modelo, anoFabricacao);
        this.numeroPortas = numeroPortas;
        this.temArCondicionado = temArCondicionado;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de Portas: " + numeroPortas);
        System.out.println("Ar Condicionado: " + (temArCondicionado ? "Sim" : "Não"));
    }
}