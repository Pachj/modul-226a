import java.util.Date;

public class TestPreisliste {
    public static void main(String[] args) {
        Preisliste preisliste = new Preisliste();

        preisliste.addPreis(120.50, new Date().toString());
        System.out.println(preisliste.toString());
    }
}
