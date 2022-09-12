package br.ufpb.dcx.rodrigor.poo.set12.restaurante.hamburgueria;

import java.util.*;

public class Hamburgueria {

    private String nome;


    private Map<String,Hamburguer> hamburguers;


    public Hamburgueria(String nome){
        this.nome = nome;
        this.hamburguers = new HashMap<>();
    }

    public void addHamburger(Hamburguer hamburguer){
        this.hamburguers.put(hamburguer.getNome(),hamburguer);
    }

    public Hamburguer prepararHamburger(String nome){
        return hamburguers.get(nome);
    }

    public Set<String> getMenu(){
        return hamburguers.keySet();
    }

}
