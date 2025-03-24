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
                    //add books
                    
                }
                else if(choice.equalsIgnoreCase("F")){
                    //findBook()
                }
                else if(choice.equalsIgnoreCase("P")){
                    //printall()
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
