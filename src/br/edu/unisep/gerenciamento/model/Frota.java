package br.edu.unisep.gerenciamento.model;

import java.util.ArrayList;

public class Frota {
    ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculo veiculo) {
        listaVeiculos.add(veiculo);
    }

    public void exibirFrota() {
        for (Veiculo veiculo : listaVeiculos) {
            veiculo.exibirDetalhes();
            System.out.println("--------------------");
        }
    }
}

