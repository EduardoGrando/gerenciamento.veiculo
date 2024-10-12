package br.edu.unisep.gerenciamento.view;

import br.edu.unisep.gerenciamento.model.Caminhao;
import br.edu.unisep.gerenciamento.model.Carro;
import br.edu.unisep.gerenciamento.model.Frota;
import br.edu.unisep.gerenciamento.model.Moto;

public class GerenciamentoVeiculos {

    public static void main(String[] args) {
        Frota frota = new Frota();

        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 4, true);
        Moto moto1 = new Moto("Honda", "CB 500", 2019, 500, true);
        Caminhao caminhao1 = new Caminhao("Volvo", "FH", 2022, 20, 6);

        frota.adicionarVeiculo(carro1);
        frota.adicionarVeiculo(moto1);
        frota.adicionarVeiculo(caminhao1);

        frota.exibirFrota();


    }
}