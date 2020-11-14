package git.IngineriaProgramarii;

abstract class Personal {
    String nume;
    String prenume;
    int varsta;
    String CNP;
    String specializare;
    Program program;

    abstract void afisarePersoana();
    abstract void adaugarePersoana(String CNP,String nume, String prenume, String specializare, int varsta, Program program);
    abstract void lucreaza();
}
