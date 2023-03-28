public class Tank extends ParteInferiore implements CanAttack {
    public void move(String direzione){
        System.out.println("Mi sto muovendo in "+direzione);
    }

    public void attacca() {
        System.out.println("Ti sparo!");
    }
    
}
