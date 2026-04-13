package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {

        Prodotto saponeDiMarsiglia = new Prodotto("Sapone di Marsiglia", "Un sapone che pulisce benissimo.",
                22.10f, 1.22f);

        System.out.println(saponeDiMarsiglia.nome);
        System.out.println(saponeDiMarsiglia.codice);

    }

}
