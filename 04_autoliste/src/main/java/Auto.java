public class Auto {
    private String autoname;
    private int ps;
    private int hubraum;
    private Farbe farbe;
    private Typ typ;

    Auto(String autoname, int ps, int hubraum, Farbe farbe, Typ typ) {
        this.autoname = autoname;
        this.ps = ps;
        this.hubraum = hubraum;
        this.farbe = farbe;
        this.typ = typ;
    }

    public String getAutoname() {
        return autoname;
    }

    public void setAutoname(String autoname) {
        this.autoname = autoname;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getHubraum() {
        return hubraum;
    }

    public void setHubraum(int hubraum) {
        this.hubraum = hubraum;
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public void setFarbe(Farbe farbe) {
        this.farbe = farbe;
    }

    public Typ getTyp() {
        return typ;
    }

    public void setTyp(Typ typ) {
        this.typ = typ;
    }
}
