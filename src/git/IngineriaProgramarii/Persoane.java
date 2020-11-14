package git.IngineriaProgramarii;

public class Persoane extends Personal{

    public Persoane(String nume, String prenume, String specializare, int varsta, Program program) {
        this.nume = nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.specializare=specializare;
        this.program=program;
    }

    @Override
    void lucreaza() {
        System.out.println("Muncitorul:"+this.nume+" "+this.prenume+" lucreaza");
    }

    @Override
    void afisarePersoana() {
        System.out.println("Nume:"+this.nume+" Prenume:"+this.prenume+" varsta:"+this.varsta+" specializare:"+this.specializare);
    }

    @Override
    void adaugarePersoana(String nume, String prenume, String specializare, int varsta, Program program) {
        this.nume=nume;
        this.prenume=prenume;
        this.specializare=specializare;
        this.varsta=varsta;
        this.program=program;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getSpecializare() {
        return specializare;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }
}
