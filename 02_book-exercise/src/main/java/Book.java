/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Henry Joerg
 * @version 20210913
 */
class Book {
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages)
    {
        author = bookAuthor;
        title = bookTitle;
        this.pages = pages;
        this.refNumber = "";
        this.borrowed = 0;
    }
    // Add the methods here ...

    public void printAuthor() {
        System.out.println(this.author);
    }

    public void printTitle() {
        System.out.println(this.title);
    }

    public int getPages() {
        return this.pages;
    }

    public void printDetails() {
        System.out.println("Titel: " + this.title + ", Autor: " + this.author + ", Seiten: " + this.pages + ", Ref Number: " + this.refNumber);
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public void borrow() {
        this.borrowed += 1;
    }

    public int getBorrowed() {
        return this.borrowed;
    }
}
