package git.IngineriaProgramarii;

public class Program {
    int ora_inceput;
    int ora_final;
    int ore_lucru;

    public Program(int ora_inceput, int ora_final) {
        this.ora_inceput = ora_inceput;
        this.ora_final = ora_final;
        this.ore_lucru=ora_final-ora_inceput;
    }

    public void setOre_lucru(int ore_lucru) {
        this.ore_lucru = ore_lucru;
    }

    public void setOra_final(int ora_final) {
        this.ora_final = ora_final;
    }

    public void setOra_inceput(int ora_inceput) {
        this.ora_inceput = ora_inceput;
    }

    public int getOre_lucru() {
        return ore_lucru;
    }

    public int getOra_final() {
        return ora_final;
    }

    public int getOra_inceput() {
        return ora_inceput;
    }
}
