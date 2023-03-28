public class Tank extends ParteInferiore implements CanAttack {

    @Override
    public void muovi(String direzione) {
        System.out.println("Mi muovo a "+direzione);
    }

    @Override
    public void attacca() {
        System.out.println("TI SPARO DAL TANK!!!");
    }
    
}
