/**
 * @author Henry Joerg
 * @date 2021.12.06
 * */

public class Preis {
    private double value;
    private String date;

    public Preis(double value, String date) {
        this.value = value;
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
