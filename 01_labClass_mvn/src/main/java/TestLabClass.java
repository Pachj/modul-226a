
public class TestLabClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student henry = new Student("Henry", "123-123-123-123");
		Student chantal = new Student("Chantal", "234-234-234-234");

		LabClass labClass2 = new LabClass(17);

		labClass2.enrollStudent(henry);
		labClass2.enrollStudent(chantal);

		labClass2.printList();


		// neues LabClass-Objekt erstellen
		LabClass labClass = new LabClass(17);
		// neue Studenten erzeugen
		Student bill = new Student("Billy","111-221-331-441");
		// . . . . . . .
		
		// billy zur Klasse hinzuf�gen
		labClass.enrollStudent(bill);
		// . . . . . .
		
		// neuer Student
		Student max = new Student("Maxli","22-44-55");
		//  . . . . . 
		
		// student hinzuf�gen
		labClass.enrollStudent(max);
		
		
		// Room Number setzen
		labClass.setRoom("Room 403");
		// Instrktor setzen
		labClass.setInstructor("Cavuoti");
		
		// Ausgabe
		labClass.printList();
		
	}

}
