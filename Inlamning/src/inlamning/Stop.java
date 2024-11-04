package inlamning;

public class Stop {
    private int antalTecken;
    private int antalRader;

    public Stop() {
        antalTecken = 0;
        antalRader = 0;
    }

    public void laggTillRad(String rad) {
        antalTecken += rad.length();
        antalRader++;
    }

    public int getAntalTecken() {
        return antalTecken;
    }

    public int getAntalRader() {
        return antalRader;
    }

}
