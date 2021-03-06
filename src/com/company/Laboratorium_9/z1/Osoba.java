package com.company.Laboratorium_9.z1;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) throws Exception {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;

        sprawdzDaneOsoby(imie, nazwisko, rokUrodzenia);
    }

    private void sprawdzDaneOsoby(String imie, String nazwisko, int rokUrodzenia) throws Exception {
        if (imie.isBlank())
            throw new Exception("podano niewłasiciwe imię");
        if (nazwisko.isBlank())
            throw new Exception("podano niewłasciwe nazwisko");
        if(rokUrodzenia<1900 || rokUrodzenia>2021)
            throw new Exception("podano niewłasciwy rok urodzenia");
    }

    @Override
    public String toString() {
        return imie + " "+ nazwisko + " " + "rok urodzenia" + rokUrodzenia;
    }
}
