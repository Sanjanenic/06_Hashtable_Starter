package UE02_LibraryHash;

import java.io.BufferedReader;
import java.io.FileReader;

public class LibraryHash
{
    private String[] books;

    // Konstruktor
    public LibraryHash(int size)
    {
        books = new String[size];
    }

    // Bücher aus einer Textdatei einlesen
    public void addBooksFromFile()
    {
        String line;
        BufferedReader br = null;

        try
        {
            br = new BufferedReader(new FileReader("books.txt"));

            while ((line = br.readLine()) != null)   {
                add(line);
            }

            br.close();
        } catch (Exception | HashFullException e)
        {
            e.printStackTrace();
        }
    }

    // Ein Buch zur Hashtable hinzufügen
    public void add(String bookTitle) throws HashFullException
    {
//Das war TODO


     int pos=Math.abs(bookTitle.hashCode())% books.length;
     int hashvalue=0;
     for (int i=0; i<books.length; i++){
         hashvalue=Math.abs(bookTitle.hashCode()+1)% books.length;

       //Ist meine berechneter Platz noch frei?
         if(books[hashvalue]== null) {
             books[hashvalue] = bookTitle;
             return;
         }
     }

    }

    // Ein Buch aus der Hashtable entfernen
    public Boolean remove(String bookTitle)
    {
        // TODO: Implementieren
        int hashValue=0;
        //Keine Tombstoms in diesem Beispiel
        for (int i=0; i<books.length; i++){
            //Position
            hashValue= Math.abs(bookTitle.hashCode()+1)% books.length;
            //Gibt es Buch uberhaupt?
            if(books[hashValue]==null)
                return false;
            //Das ist gefunden BUch
             else if(books[hashValue].equals(bookTitle)){
                 books[hashValue]=null;
                 return true;
             }
        }
        return false;
    }

    // Abfrage, ob ein bestimmtes Buch in der Hashtable vorhanden ist
    public Boolean isBookInStock(String bookTitle)
    {
        // TODO: Implementieren
       int hashvalue=0;
        for (int i=0; i<books.length; i++){
            //Position berrechnen
            hashvalue=Math.abs(bookTitle.hashCode()+1)% books.length;

            //Ist position das gesuchte buch
            if(books[hashvalue]==null)
                return false;
            if(books[hashvalue].equals(bookTitle)){
                return true;
            }


        }
        return false;
    }

}
