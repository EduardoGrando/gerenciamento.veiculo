package br.edu.unisep.gerenciamento.model;

public class Caminhao extends Veiculo {
    int capacidadeCarga;
    int numeroEixos;

    public Caminhao(String marca, String modelo, int anoFabricacao, int capacidadeCarga, int numeroEixos) {
        super(marca, modelo, anoFabricacao);
        this.capacidadeCarga = capacidadeCarga;
        this.numeroEixos = numeroEixos;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas");
        System.out.println("Número de Eixos: " + numeroEixos);
    }
}