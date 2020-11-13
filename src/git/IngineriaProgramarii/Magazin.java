package git.IngineriaProgramarii;

import java.util.ArrayList;

public class Magazin {
    String nume_magazin;
    String locatie;
    ArrayList<Persoane>personal_magazin;
    ArrayList<Electronice>produse_magazin;

    public Magazin(String nume_magazin, String locatie, ArrayList<Persoane> personal_magazin, ArrayList<Electronice> produse_magazin) {
        this.nume_magazin = nume_magazin;
        this.locatie = locatie;
        this.personal_magazin = personal_magazin;
        this.produse_magazin = produse_magazin;
    }

    public String getNume_magazin() {
        return nume_magazin;
    }

    public String getLocatie() {
        return locatie;
    }

    public ArrayList<Persoane> getPersonal_magazin() {
        return personal_magazin;
    }

    public ArrayList<Electronice> getProduse_magazin() {
        return produse_magazin;
    }
}
