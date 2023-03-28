import java.lang.ProcessBuilder.Redirect.Type;

public class Jeeg {
    private Braccio braccioDx;
    private Braccio braccioSx;
    private ParteInferiore parteInferiore;


    public Jeeg(Braccio braccioDx, Braccio braccioSx, ParteInferiore parteInferiore) {
        this.braccioDx = braccioDx;
        this.braccioSx = braccioSx;
        this.parteInferiore = parteInferiore;
    }

    public void attacca(String lato) {
        if (lato=="dx") {
            this.braccioDx.attacca();
        }
        if (lato=="sx") {
            this.braccioSx.attacca();
        }

        if (lato=="giu" && this.parteInferiore.getClass().getName()=="Tank") {
            Tank tank = (Tank) this.parteInferiore;
            tank.attacca();
        }
    }

    public void muovi(String direzione) {
        this.parteInferiore.muovi(direzione);
    }
}
