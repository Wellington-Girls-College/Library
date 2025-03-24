import ecs100.*;
/**
 * Support class for Books
 * A Book contains an id, name, author, quantity, image
 * 
 *
 * @author WGT
 * @version (a version number or a date)
 */
public class Book
{
    // fields
    private int id;
    private String name;
    private String author;
    private int quantity;
    private String image;

    /**
     * Constructor for objects of class Books
     */
    public Book(int key, String nm, String auth, int qty)
    {
        id = key;
        name = nm; 
        author = auth;
        quantity = qty;
    }

    /**
     * Getter for id
     */
    public int getId(){
        return this.id;
    }
    /**
     * Getter for name
     */
    public String getName(){
        return this.name;
    }
    /**
     * Getter for author
     */
    public String getAuthor(){
        return this.author;
    }
    /**
     * Getter for quantity
     */
    public int getQuantity(){
        return this.quantity;
    }
}
