import java.util.ArrayList;
import java.util.Objects;


public class AutoGarage {

	// Attribute
	private ArrayList<Auto> autoListe ;  // deklaration
	
	public AutoGarage() 
	{
		autoListe = new ArrayList<Auto>();
	}
	
	
	public void setService (Auto auto)
	{
		// das auto in die Liste einf�gen
		//
		this.autoListe.add(auto);
	}
	public Auto getAutoMitKennzeichen (String kennzeichen)
	{
		// suche in der Liste das auto mit dem Kennzeichen
		// gib das gefundene auto Objekt zurück
		// falls nicht gefunden gib NULL zurück
		for (Auto auto: this.autoListe) {
			if (Objects.equals(auto.getKennzeichen(), kennzeichen)) {
				return auto;
			}
		}

		return null;
	}
	public boolean unsetService (String kennzeichen)
	{
		// suche auto mit kennzeichen
		// l�sche gefundene auto aus der Liste gib true zurück
		// falls nicht gefunden gib false zurück
		for (int i = 0; i < this.autoListe.size(); i++) {
			if (Objects.equals(this.autoListe.get(i).getKennzeichen(), kennzeichen)) {
				this.autoListe.remove(i);
				return true;
			}
		}

		return false;
	}
	
	public void showAutoInService()
	{
		// Alle Autos anziegen die im Service sind
		for (Auto auto : this.autoListe) {
			System.out.println(auto.getKennzeichen());
		}
	}
	
	public String toString()
	{
		// String zusammensetzen und zurückgeben
		return null;
	}
}
