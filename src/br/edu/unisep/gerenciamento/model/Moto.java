package br.edu.unisep.gerenciamento.model;

public class Moto extends Veiculo {
    int cilindradas;
    boolean temPartidaEletrica;

    public Moto(String marca, String modelo, int anoFabricacao, int cilindradas, boolean temPartidaEletrica) {
        super(marca, modelo, anoFabricacao);
        this.cilindradas = cilindradas;
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Partida Elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
    }
}
