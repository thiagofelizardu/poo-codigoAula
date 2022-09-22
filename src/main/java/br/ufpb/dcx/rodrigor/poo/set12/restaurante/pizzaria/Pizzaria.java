package br.ufpb.dcx.rodrigor.poo.set12.restaurante.pizzaria;

import br.ufpb.dcx.rodrigor.poo.set12.restaurante.Comida;
import br.ufpb.dcx.rodrigor.poo.set12.restaurante.Restaurante;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

    public Pizza prepararPizza (String nome){
        return pizzas.get(nome);
    }

    public Pizza getPizza(String nome){
        return this.pizzas.get(nome);
    }

    public Set<String> getMenu(){
        return pizzas.keySet();
    }

    @Override
    public List<String> listarMenu() {
       List<String> menu = new LinkedList<>();
       for(String nome : getMenu()){
        menu.add(nome);
       }
        return menu;
    }

    @Override
    public Comida cozinhar(String item) {
        return prepararPizza(item);
    }



}
