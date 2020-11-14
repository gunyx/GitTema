package git.IngineriaProgramarii;

public class Main {
    public static void main(String[] argv) {

        System.out.println("ceva");
        Program program=new Program(10,11);
        Personal daniel=new Persoane("daniel","daniel","angajat",22,program) {
            @Override
            void afisarePersoana() {
                super.afisarePersoana();
            }
        };
        daniel.afisarePersoana();
    }
}

