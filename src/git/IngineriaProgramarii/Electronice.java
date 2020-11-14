package git.IngineriaProgramarii;

import java.util.ArrayList;

abstract class Electronice {
    String categorie;
    String denumire_produs;
    String garantie;
    float pret_produs;
    int cod_produs;
    String detalii_produs;
    abstract void afisareProdus();
    abstract void adaugarePersoana( String categorie, String denumire_produs, String garantie, float pret_produs, int cod_produs, String detalii_produs);
}
