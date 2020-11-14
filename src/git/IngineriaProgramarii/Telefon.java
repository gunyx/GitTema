package git.IngineriaProgramarii;

public abstract class Telefon extends Electronice {
    @Override
    void afisareProdus() {
        System.out.println("Acest string contine detaliile unui produs");
    }

    public Telefon(String categorie, String denumire_produs, String garantie, float pret_produs, int cod_produs, String detalii_produs) {
        this.categorie="Telefon";
        this.cod_produs=cod_produs;
        this.denumire_produs=denumire_produs;
        this.garantie=garantie;
        this.pret_produs=pret_produs;
        this.cod_produs=cod_produs;
        this.detalii_produs=detalii_produs;
    }

    @Override
    void adaugarePersoana(String categorie, String denumire_produs, String garantie, float pret_produs, int cod_produs, String detalii_produs) {
        this.categorie="Telefon";
        this.cod_produs=cod_produs;
        this.denumire_produs=denumire_produs;
        this.garantie=garantie;
        this.pret_produs=pret_produs;
        this.cod_produs=cod_produs;
        this.detalii_produs=detalii_produs;

    }
}
