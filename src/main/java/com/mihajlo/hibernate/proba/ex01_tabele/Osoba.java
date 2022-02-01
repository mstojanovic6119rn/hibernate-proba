package com.mihajlo.hibernate.proba.ex01_tabele;

import javax.persistence.*;

@Entity /// ova klasa je mapirana preko entiteta u bazi
@Table(name = "osoba") /// tabela preko koje je mapirana se zove "osoba"
public class Osoba {

    @Id /// polje je mapirano preko primarnog kljuca tabele
    @GeneratedValue(strategy = GenerationType.IDENTITY) /// auto_increment
    @Column(name = "osoba_id") /// kolona ima naziv "osoba_id"
    private Integer osobaId; /// tip podatka: INT

    @Column(name = "ime", /// naziv kolone: "ime"
            length = 30, /// velicina kolone: 30
            nullable = false) /// da li je kolona opciona: NE
    private String ime; /// tip podatka: VARCHAR(30) -> 30 jer je to length

    @Column(name = "prezime", length = 30, nullable = false)
    private String prezime;

    @Column(name = "broj_godina", nullable = false) /// nije potrebno, sem kod VARCHAR-a, pisati length metodu
    private Integer brojGodina;

    /// treba nam prazan (noargs) konstruktor
    public Osoba() {
        super();
    }

    /// treba nam konstruktor koji prima sva polja sem primarnog kljuca (koji je auto_increment)
    public Osoba(String ime, String prezime) {
        super();
        this.ime = ime;
        this.prezime = prezime;
    }

    /// trebaju nam svi geteri i seteri

    public Integer getOsobaId() {
        return osobaId;
    }

    public void setOsobaId(Integer osobaId) {
        this.osobaId = osobaId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
}
