package br.ufpb.dcx.rodrigor.poo.set12.restaurante.hamburgueria;

public class Exemplo {

    public static void main(String[] args) {

        Hamburgueria lanchonete = new Hamburgueria("Lanchonete do Lucas");

        Hamburguer xburger = new Hamburguer("XBurger");
        xburger.addIngrediente("Pão");
        xburger.addIngrediente("Queijo");

        Hamburguer xtudo = new Hamburguer("XTudo");
        xtudo.addIngrediente("Pão");
        xtudo.addIngrediente("Queijo");
        xtudo.addIngrediente("Carne");

        lanchonete.addHamburger(xburger);
        lanchonete.addHamburger(xtudo);

        for(String item:lanchonete.getMenu()){
            System.out.println(item);
        }

    }
}
