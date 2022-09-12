package br.ufpb.dcx.rodrigor.poo.set12.restaurante.hamburgueria;

import java.util.ArrayList;
import java.util.List;

public class Hamburguer {

    private String nome;
    private List<String> ingredientes;

    public Hamburguer(String nome) {
        this.nome = nome;
        this.ingredientes = new ArrayList<>(15);
    }

    public void addIngrediente(String ingrediente){
        this.ingredientes.add(ingrediente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}