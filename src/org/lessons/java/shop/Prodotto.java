package org.lessons.java.shop;

import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public BigDecimal prezzo;
    public BigDecimal iva;

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {

        Random randomNumber = new Random();

        this.codice = randomNumber.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public BigDecimal getPrice() {
        return this.prezzo.setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal getPriceWithIva() {

        if (this.prezzo != null && this.nome != null) {
            return this.prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }

        return null;
    }

    public String getFullName() {
        if (nome != null) {
            return this.codice + "-" + this.nome;
        }

        return null;
    }

}
