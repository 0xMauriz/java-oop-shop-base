package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Prodotto saponeDiMarsiglia = new Prodotto("Sapone di Marsiglia", "Un sapone che pulisce benissimo.",
                new BigDecimal(8.2), new BigDecimal(0.22));
        Prodotto doritosChili = new Prodotto("Doritos gusto chili",
                "Tortillas fritte, tossiche ma veramente buonissime!",
                new BigDecimal(2.10), new BigDecimal(0.22));
        Prodotto oreoClassic = new Prodotto("Oreo gusto classico",
                "Un biscotto al cacao con dentro vaglia, sempre abbastanza tossici ma vabbè.",
                new BigDecimal(1.4), new BigDecimal(0.22));

        System.out.println(saponeDiMarsiglia.getFullName());
        System.out.println(saponeDiMarsiglia.getPrice());
        System.out.println(saponeDiMarsiglia.getPriceWithIva());

        System.out.println(doritosChili.getFullName());
        System.out.println(doritosChili.getPrice());
        System.out.println(doritosChili.getPriceWithIva());

        System.out.println(oreoClassic.getFullName());
        System.out.println(oreoClassic.getPrice());
        System.out.println(oreoClassic.getPriceWithIva());

    }

}
