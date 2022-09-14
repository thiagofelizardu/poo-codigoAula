package br.ufpb.dcx.rodrigor.poo.set12.restaurante.hamburgueria;

import br.ufpb.dcx.rodrigor.poo.set12.restaurante.Comida;
import br.ufpb.dcx.rodrigor.poo.set12.restaurante.Restaurante;

import java.util.*;

public class Hamburgueria implements Restaurante {

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

    @Override
    public List<String> listarMenu() {
        List<String> menu = new LinkedList<>();
        for(String nome: getMenu()){
            menu.add(nome);
        }
        return menu;
    }

    @Override
    public Comida cozinhar(String item) {
        return prepararHamburger(item);
    }
}
