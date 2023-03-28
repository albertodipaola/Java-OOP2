public class App {
    public static void main(String[] args) throws Exception {      
        Jeeg jeeg = new Jeeg(new Laser("destra"), new Laser("sinistra"), new Tank());
        jeeg.attacca();
        jeeg.attacca();
        jeeg.move("avanti");
    }
}
