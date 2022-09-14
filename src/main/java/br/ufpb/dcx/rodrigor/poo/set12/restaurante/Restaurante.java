package br.ufpb.dcx.rodrigor.poo.set12.restaurante;

import java.util.List;

public interface Restaurante {

    public List<String> listarMenu();

    public Comida cozinhar(String item);

}
