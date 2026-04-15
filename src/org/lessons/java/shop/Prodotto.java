package org.lessons.java.shop;

import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {

    private final int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {

        Random randomNumber = new Random();

        this.codice = randomNumber.nextInt(99999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public Prodotto(String nome, String marca) {

        Random randomNumber = new Random();

        this.codice = randomNumber.nextInt(99999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = BigDecimal.ZERO;
        this.iva = BigDecimal.ZERO;

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
