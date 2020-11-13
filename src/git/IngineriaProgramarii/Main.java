package git.IngineriaProgramarii;

public class Main {
    public static void main(String[] argv) {

        Magazin my_shop=new Magazin("ElectroShop","Str.Principala nr 17","24h");
        System.out.println("ceva");
        System.out.println(my_shop.toString());
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

