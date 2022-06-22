package UE05_LibraryHashWithList;

import org.w3c.dom.Node;

import java.util.Iterator;
import java.util.LinkedList;

public class LibraryHashWithList {
    // war TODO: Liste, die je Position aus einer LinkedList besteht
private LinkedList<Book> [] books;




    public LibraryHashWithList(int size) {
        // war TODO: Logik implementieren
        //books= new LinkedList <Book>[size];
    }

    public boolean addBook(Book newBook)
    {
        // war TODO: Implementieren
        //Index von Array finden, wo das Buch gespiechert werden soll
        int index=getIndexByHashCalc(newBook.getId());

        //sonderfall beachten
        if(books[index]==null){
            books[index]= new LinkedList<Book>();
        }

        //neue buch einfügen  bei verkettete liste
       return books[index].add(newBook);

    }

    public Book getBookById(int id)
    {
        // TODO: Implementieren
        // Tipp: Beim Durchsuchen der LinkedList könnte ein Iterator hilfreich sein.
        return null;
    }

    public boolean removeBook(int id)
    {
        // war TODO: Implementieren
        //index ausrecnen

        LinkedList<Book> linkedList = books[index];
        //komplete Book struktur holen nicht nur id
       return  linkedList.remove(BOOK zu impementieren eine methode oben);

    }

    public LinkedList<Book> getLinkedListAtPos(int pos)
    {
        //TODO: einkommentieren
        return [pos];

    }

    private int getIndexByHashCalc(int id)
    {
        //war TODO: einkommentieren
        return id % books.length;



    }
}
