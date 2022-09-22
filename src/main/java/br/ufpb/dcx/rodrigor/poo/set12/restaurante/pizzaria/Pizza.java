package br.ufpb.dcx.rodrigor.poo.set12.restaurante.pizzaria;

import java.util.ArrayList;
import java.util.List;

import br.ufpb.dcx.rodrigor.poo.set12.restaurante.Comida;

public class Pizza implements Comida{

    private String nome;
    private List<String> ingredientes;

    public Pizza (String nome){
        this.nome = nome;
        this.ingredientes = new ArrayList<>();
            
    }
    public void addIngrediente(String ingrediente){
        this.ingredientes.add(ingrediente);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }



}
