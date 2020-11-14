package git.IngineriaProgramarii;

import java.util.ArrayList;

public class Magazin {
    private String nume_magazin;
    private String locatie;
    private String forma_de_lucru;
    private ArrayList<Persoane>personal_magazin;
    private ArrayList<Electronice>produse_magazin;

    public Magazin(String nume_magazin, String locatie, String forma_de_lucru) {
        this.nume_magazin = nume_magazin;
        this.locatie = locatie;
        this.forma_de_lucru = forma_de_lucru;
    }

    @Override
    public String toString() {
        return "Magazinul" +
               " " + nume_magazin  +
                " se afla la locatia '" + locatie + '\'' +
                " fiind deschis '" + forma_de_lucru + '\''
                + " pe zi";
    }

    public Magazin(String forma_de_lucru) {
        this.forma_de_lucru = forma_de_lucru;
    }

    public Magazin(String nume_magazin, String locatie, ArrayList<Persoane> personal_magazin, ArrayList<Electronice> produse_magazin) {
        this.nume_magazin = nume_magazin;
        this.locatie = locatie;
        this.personal_magazin = personal_magazin;
        this.produse_magazin = produse_magazin;
    }

}
