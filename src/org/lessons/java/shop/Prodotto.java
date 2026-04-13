package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public float iva;

    public Prodotto(String nome, String descrizione, float prezzo, float iva) {

        Random randomNumber = new Random();

        this.codice = randomNumber.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

}
