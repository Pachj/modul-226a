public class TestAutoGarage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// neue FRANZ Garage erstellen
		AutoGarage franzGarage = new AutoGarage();
		// Hans Kuster bringt seinen Citroen in die Garage
		Auto c5 = new Auto("c5", "ZH-007", 100, 1600, Farbe.ROT, Typ.SPORT);
		// in der Garage abgeben
		franzGarage.setService(c5);
		// addiert einige Autos in die Garage
		// Garagen Chef m�chte das Auto mit Kennzeichen ZH-007 abrechnen
		Auto gesAuto = franzGarage.getAutoMitKennzeichen("ZH-007");
		if ( gesAuto != null)
		{// Auto gefunden abrechnen 
			// serviceAttribut auf true setzen
			// aus der Liste l�schen!
			
		}
		
		// aus der Liste austragen
		franzGarage.unsetService("ZH-007");
		
		franzGarage.showAutoInService();
	}
	

}
