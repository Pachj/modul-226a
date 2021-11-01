import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * A class to maintain an arbitrarily long list of notes. Notes are numbered for
 * external reference by a human user. In this version, note numbers start at 0.
 * 
 * @author David J. Barnes, Michael Kolling.
 * @author Luigi Cavuoti adapted to Java 8, Generics
 * @version 2021.06.08
 */
public class Notebook {
    // Storage for an arbitrary number of notes.
    /*private ArrayList<String> notes;*/
    private ArrayList<Note> notes;

    /**
     * Perform any initialization that is required for the notebook.
     */
    public Notebook() {
        notes = new ArrayList<Note>();
    }

    /**
     * Store a new note into the notebook.
     * 
     * @param note The note to be stored.
     */
    /*public void storeNote(String note) {
        notes.add(note);
    }*/

    public void storeNote(String text, String termin, String author) {
        notes.add(new Note(text, termin, author));
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes() {
        return notes.size();
    }

    /**
     * Show a note.
     * 
     * @param noteNumber The number of the note to be shown.
     */
    public void showNote(int noteNumber) {
        if (noteNumber < 0) {
            // This is not a valid note number, so do nothing.
        } else if (noteNumber < numberOfNotes()) {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber));
        } else {
            // This is not a valid note number, so do nothing.
        }
    }

    /**
     * Remove a note.
     *
     * @param noteNumber The index of the note to be removed.
     */
    public void removeNote(int noteNumber) {
        if (noteNumber >= 0 && noteNumber < numberOfNotes() ) {
            notes.remove(noteNumber);
        }
    }

    /**
     * List all notes with the corresponding index.
     *
     */
    public void listNotes() {
        int index = 0;
        while (index < numberOfNotes()) {
            System.out.println((index + 1) + ": " + notes.get(index));

            index++;
        }
    }

    // not sure if this is right
    public void listNotesIterator() {
        Iterator<String> iterator = notes.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Override
    public String toString() {

        String mynotes = "";

        Iterator<String> it = notes.iterator();
        while (it.hasNext()) {
            mynotes += it.next().toString();

        }
        return mynotes;
    }
}
