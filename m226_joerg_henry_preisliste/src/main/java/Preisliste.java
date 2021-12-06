import java.util.ArrayList;

/**
 * @author Henry Joerg
 * @date 2021.12.06
 * */

public class Preisliste {
    private ArrayList<Preis> preise;

    public Preisliste() {
        preise = new ArrayList<Preis>();
    }

    public void addPreis(double value, String date) {
        preise.add(new Preis(value, date));
    }

    public String toString() {
        String returnString = "";
        for (Preis actualPreis : preise) {
            returnString += (actualPreis.getValue() + ", ");
            returnString += (actualPreis.getDate() + ", ");
        }

        return returnString;
    }
}
