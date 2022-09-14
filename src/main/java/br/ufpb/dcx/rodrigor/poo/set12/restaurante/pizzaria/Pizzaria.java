package br.ufpb.dcx.rodrigor.poo.set12.restaurante.pizzaria;

import br.ufpb.dcx.rodrigor.poo.set12.restaurante.Restaurante;

import java.util.HashMap;
import java.util.Map;

public class Pizzaria implements Restaurante {

    private Map<String,Pizza> pizzas;
    private String nome;

    public Pizzaria(String nome){
        this.nome = nome;
        pizzas = new HashMap<>();
    }

    public void addPizza(Pizza pizza){
            pizzas.put(pizza.getNome(),pizza);
    }


    public Pizza getPizza(String nome){
        return this.pizzas.get(nome);
    }



}
