import java.util.HashMap;
import ecs100.*;
/**
 * Holds a coolection of books in a hashmap
 * Allows a user to add, find, print all, edit from a menu
 * delete
 * prevent user from adding a duplicate - stu
 *
 * @author WGT
 * @version (a version number or a date)
 */
public class Books
{
    // fields
    private HashMap<Integer, Book> library; // declaring the hashmap
    private int currBookId; // store the current id of book being added
    private Book currBook; // store the instance of the current book

    /**
     * Constructor for objects of class Books
     */
    public Books()
    {
        // initialise instance variables
        library = new HashMap<Integer, Book>(); //initialise hashmap
        
        //Create books
        Book b1 = new Book(1, "The Wicked King", "Holly Black", 2);
        Book b2 = new Book(2, "1984", "George Orwell", 42);
        Book b3 = new Book(3, "Song of Achilles", "Madelline Millar", 20);
        
        //add books to collection
        library.put(1, b1);
        library.put(2, b2);
        library.put(3, b3);
        
        this.currBookId = 3;        // Store the current book id
        
    }
    
    /**
     * Set bookId
     */
    public void setBookId(){
        this.currBookId += 1;
        
    }
    /**
     * Add a book to the map
     */
    public void addBook(String name, String author, int qty){
        library.put(currBookId, new Book(currBookId, name, author, qty));
    }
    /**
     * Finds a book basked on name
     * Sets the current book instance if found
     * @return boolean false if not found
     */
    
    public boolean findBook(String name){
        //Search for book
        for (int bookId: library.keySet()){
            if(library.get(bookId).getName().toLowerCase().equals(name.toLowerCase())){
                currBook = library.get(bookId); //Set the current Book
                return true;
            }
        }
        return false;
    }
    /**
     * Getter for the current instance
     */
    public Book getBook(){
        return  this.currBook;
    }
    
    /**
     * Print details of all books
     */
    public void printAll(){
        //Traverse Map
        for (int bookId : library.keySet()){
            UI.println(bookId + " Details: ");
            UI.println(library.get(bookId).getName() + " "
                        +library.get(bookId).getAuthor() + " "
                        +library.get(bookId).getQuantity());
        }
    }
    /**
     * Menu to print and call appropriate methods
     */
    public void menu(){
        //Print menu and force choice
        String choice;
        do{
            UI.println("(A)dd a book");
            UI.println("(F)ind a book");
            UI.println("(P)rint all");
            UI.println("(Q)uit");
            
            choice = UI.askString("Enter a choice: ");
            
                if (choice.equalsIgnoreCase("A")){
                    // Ask the user for a title, anthor and qyantity - next job for students to do
                    addBook("Night", "Eli Vissel", 55);
                    
                }
                else if(choice.equalsIgnoreCase("F")){
                    //Ask user for a book
                    String bookName = UI.askString("Name of book: ");
                    if (findBook(bookName)) // see if they can change this to a getter method, ask the user what the book they are look for and store it in a param
                    {
                        UI.println("Found Book!");
                        UI.println("Name" + currBook.getName());
                        UI.println("Author: " + currBook.getAuthor());
                        UI.println("Quantity: " + currBook.getQuantity());
                    }else{
                        UI.println(bookName + " not found!");
                    }
                }
                else if(choice.equalsIgnoreCase("P")){
                    printAll();
                }
                else if(choice.equalsIgnoreCase("Q")){
                    UI.println("Goodbye");
                    UI.quit();
                }else{
                    UI.println("Not a valid choice.");
                }
        }while (!choice.equalsIgnoreCase("Q"));
    }
}
