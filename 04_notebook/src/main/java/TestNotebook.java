
public class TestNotebook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// instanciate a new notebook Object
		Notebook notebook = new Notebook();
		// save some notes 
		notebook.storeNote("Hey, my first note", "1988-09-29", "Henry Joerg");
		// show note 0
		notebook.showNote(0);
		// show notes
		System.out.println( "notebook: " + notebook.toString());

	}

}
