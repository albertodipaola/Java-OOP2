public class Jeeg {
    private Braccio braccioDx;
    private Braccio braccioSx;
    private ParteInferiore parteInferiore;

    public Jeeg(Braccio braccioDx, Braccio braccioSx, ParteInferiore parteInferiore) {
        this.braccioDx = braccioDx;
        this.braccioSx = braccioSx;
        this.parteInferiore = parteInferiore;
    }

    public void attacca() {
        this.braccioDx.attacca();
        this.braccioSx.attacca();

        Class<? extends Object> classe = parteInferiore.getClass();
        if(classe.toString().equals("class Tank")){
            Tank tank = (Tank) this.parteInferiore;
            tank.attacca();
        }
    }

    public void move(String direzione) {
        this.parteInferiore.move(direzione);
    }
}
