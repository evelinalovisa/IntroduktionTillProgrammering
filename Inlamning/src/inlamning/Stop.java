package inlamning;

public class Stop {
    private int antalTecken;
    private int antalRader;
    private int antalOrd;
    private String langstaOrdet;

    public Stop() {
        antalTecken = 0;
        antalRader = 0;
        antalOrd = 0;
        langstaOrdet = "";
    }

    public void laggTillRad(String rad) {
        antalTecken += rad.length();
        antalRader++;

        String[] ord = rad.trim().split(" ");
        antalOrd += ord.length;

        for (String o : ord) {
            if (o.length() > langstaOrdet.length()) {
                langstaOrdet = o;
            }
        }
    }

    public int getAntalTecken() {
        return antalTecken;
    }

    public int getAntalRader() {
        return antalRader;
    }

    public int getAntalOrd() {
        return antalOrd;
    }
    public String getLangstaOrdet() {
        return langstaOrdet;
    }
}