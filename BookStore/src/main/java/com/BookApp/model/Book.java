package com.BookApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {

    public Book(Long id, String name, String autor, String zaner, String datumvydania, String vydavatelstvo, int pocetstran, 
            String jazyk, String ISBN, String Popis, boolean dostupnost, int mnozstvonapredaj, int mnozstvonavypozicku, double cena) {
        this.id = id;
        this.name = name;
        this.autor = autor;
        this.zaner = zaner;
        this.datumvydania = datumvydania;
        this.vydavatelstvo = vydavatelstvo;
        this.pocetstran = pocetstran;
        this.jazyk = jazyk;
        this.ISBN = ISBN;
        this.Popis = Popis;
        this.dostupnost = dostupnost;
        this.mnozstvonapredaj = mnozstvonapredaj;
        this.mnozstvonavypozicku = mnozstvonavypozicku;
        this.cena = cena;
    }

   
    private Long id;
    
    private String name;
    private String autor;
    private String zaner;
    private String datumvydania;
    private String vydavatelstvo;
    private int pocetstran;
    private String jazyk;
    private String ISBN;
    private String Popis;
    private boolean dostupnost;
    private int mnozstvonapredaj;
    private int mnozstvonavypozicku;
    private double cena;

    public Book() {
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "autor")
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Column(name = "zaner")
    public String getZaner() {
        return zaner;
    }

    public void setZaner(String zaner) {
        this.zaner = zaner;
    }

    @Column(name = "datumvydania")
    public String getDatumvydania() {
        return datumvydania;
    }

    public void setDatumvydania(String datumvydania) {
        this.datumvydania = datumvydania;
    }

    @Column(name = "vydavatelstvo")
    public String getVydavatelstvo() {
        return vydavatelstvo;
    }

    public void setVydavatelstvo(String vydavatelstvo) {
        this.vydavatelstvo = vydavatelstvo;
    }

    @Column(name = "pocetstran")
    public int getPocetstran() {
        return pocetstran;
    }

    public void setPocetstran(int pocetstran) {
        this.pocetstran = pocetstran;
    }

    @Column(name = "jazyk")
    public String getJazyk() {
        return jazyk;
    }

    public void setJazyk(String jazyk) {
        this.jazyk = jazyk;
    }

    @Column(name = "ISBN")
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Column(name = "Popis")
    public String getPopis() {
        return Popis;
    }

    public void setPopis(String Popis) {
        this.Popis = Popis;
    }

     @Column(name="dostupnost")
    public boolean isDostupnost() {
        return dostupnost;
    }

    public void setDostupnost(boolean dostupnost) {
        this.dostupnost = dostupnost;
    }
    @Column(name="mnozstvonapredaj")
    public int getMnozstvonapredaj() {
        return mnozstvonapredaj;
    }

    public void setMnozstvonapredaj(int mnozstvonapredaj) {
        this.mnozstvonapredaj = mnozstvonapredaj;
    }
    @Column(name="mnozstvonavypozicku")
    public int getMnozstvonavypozicku() {
        return mnozstvonavypozicku;
    }

    public void setMnozstvonavypozicku(int mnozstvonavypozicku) {
        this.mnozstvonavypozicku = mnozstvonavypozicku;
    }
    @Column(name="cena")
    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
