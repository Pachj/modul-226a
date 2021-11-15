import java.util.ArrayList;
import java.util.Iterator;

public class Autoliste {
    public static void main(String[] args) {
        ArrayList<String> autoListe = new ArrayList<String>();

        autoListe.add("Opel Corsa");
        autoListe.add("Opel Zafira");
        autoListe.add("Ford Focus");
        autoListe.add("Porsche 911");
        autoListe.add("Suzuki Swift");
        autoListe.add("Toyota Corolla");
        autoListe.add("Ferrari LaFerrari");
        autoListe.add("McLaren 720s");
        autoListe.add("Ford Transit");

        for (int i = 0; i < autoListe.size(); i++) {
            System.out.println(autoListe.get(i));
        }

        for (String auto : autoListe) {
            System.out.println(auto);
        }

        Iterator<String> it = autoListe.iterator();
        while (it.hasNext() ) {
            System.out.println(it.next());
        }

        ArrayList<Auto> autoObjectListe = new ArrayList<Auto>();
        autoObjectListe.add(new Auto(autoListe.get(0), 90, 1200, Farbe.ROT, Typ.KOMPAKT));

        for (Auto auto : autoObjectListe) {
            System.out.println(auto.getAutoname());
        }
    }
}
