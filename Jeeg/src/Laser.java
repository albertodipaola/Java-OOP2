public class Laser extends Braccio{

    public Laser(String lato) {
        super(lato);
    }

    public void attacca() {
        System.out.println("ti attacco con il laser a "+this.lato);
    }
}
