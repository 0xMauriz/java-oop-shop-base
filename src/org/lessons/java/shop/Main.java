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
                Prodotto caramelleUova = new Prodotto("Caramelle Fini uova al tegamino",
                                "Caramelle a forma di uova al tegamino, parecchio buone ma lo zucchero non fà bene",
                                new BigDecimal(2.35), new BigDecimal(0.22));
                Prodotto paneAngeli = new Prodotto("Pane angeli", "Pane Angeli");

                System.out.println(saponeDiMarsiglia.getFullName());
                System.out.println(saponeDiMarsiglia.getPrice());
                System.out.println(saponeDiMarsiglia.getPriceWithIva());

                System.out.println(doritosChili.getFullName());
                System.out.println(doritosChili.getPrice());
                System.out.println(doritosChili.getPriceWithIva());

                System.out.println(oreoClassic.getFullName());
                System.out.println(oreoClassic.getPrice());
                System.out.println(oreoClassic.getPriceWithIva());

                System.out.println(caramelleUova.getFullName());
                System.out.println(caramelleUova.getPrice());
                System.out.println(caramelleUova.getPriceWithIva());

                System.out.println(paneAngeli.getFullName());
                System.out.println(paneAngeli.getPrice());
                System.out.println(paneAngeli.getPriceWithIva());

        }

}
