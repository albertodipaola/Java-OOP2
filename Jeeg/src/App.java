public class App {
    public static void main(String[] args) throws Exception {
        Jeeg jeeg = new Jeeg(new Spada(), new Braccio(), new Tank());

        jeeg.attacca("dx");
        jeeg.attacca("sx");
        jeeg.attacca("giu");

        jeeg.muovi("avanti");
        jeeg.muovi("indietro");
    }
}
