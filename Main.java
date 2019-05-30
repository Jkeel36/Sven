// imported libraries
import java.util.Scanner;   // to use Scanner, nextLine, & other keyboard inputs
import java.io.File;        // File
import java.io.IOException; // IOException
import java.io.FileWriter;  // write

class Main 
{
  // constants
  static final String NAME = "Sven";
  static final String INVENTORY_LIST_FILENAME = "ItemsForSale.txt";
  static final int EXIT_CHOICE = 3;

  public static void main(String[] args)
  {
    // local variables
    
    // list of items
    InventoryList itemsForSale = new InventoryList();  
    
    // to obtain human's input
    Scanner keyboard = new Scanner(System.in);     
    int customerSelection = 0; 

    String userMenuChoice = "";   // human inputted menu choice
    String newItem = "";          // new item added to inventory

    // setting up the screen (interface / view)
    System.out.println("\n\n\nHello, I am the world's first smart vending machine. My name is " + NAME + "!\n\n\n");

    System.out.println();
    
    displayMenu();

    userMenuChoice = keyboard.nextLine();
    userMenuChoice = userMenuChoice.trim(); // trim leading & trailing spaces

    if (userMenuChoice.equals("1") || userMenuChoice.equals("A") || userMenuChoice.equals("a"))
    {
      System.out.println("IN ADMIN MODE.....");
      System.out.print("What is your new item? ");
      newItem = keyboard.nextLine();
      itemsForSale.addItem(newItem);
      System.out.println("Your updated inventory list is: ");
      itemsForSale.displayList();

      try
      { 
        FileWriter externalFile = new FileWriter("itemsForSale.txt", true);  // append mode
        
        externalFile.write(newItem + "\n");
        externalFile.flush();                      
        externalFile.close();                                    
      }                                                           
      catch (IOException ioe)
      {
        System.err.println(ioe);
      }

    }
    else if (userMenuChoice.equals("2") || userMenuChoice.equals("C") || userMenuChoice.equals("c"))
    {
      System.out.println("IN CUSTOMER MODE.....");
      
      itemsForSale.displayList();

      for (int i = 0; i < itemsForSale.numberOfItems(); i++)
      {
        System.out.println((i + 1) + ". " + itemsForSale.selectItem(i));
      }

      System.out.println("What would you like to purchase? ");
      customerSelection = keyboard.nextInt();

      // display available item by reading those values from an external data file
      // allow customer to input a choice
      // trust the user to select the correct item from the machine & 
      // deposit exact amount of MinichPay (not ApplePay or AndroidPay) money 
      // in our Room 311 cash till on the honesty system
    }
    else if (userMenuChoice.equals("3") || userMenuChoice.equals("E") || userMenuChoice.equals("e"))
    {
      System.out.println("You have chosen to exit. Have a nice day!");
    }
    else if (userMenuChoice.equals("minich") || userMenuChoice.equals("Minich") || userMenuChoice.equals("MINICH"))
    {
      System.out.println("YOU HAVE ENTERED GAME MODE");
      Hangman game = new Hangman();
          game.play();
    }

    } // end of main method

  // display menu
  public static void displayMenu()
  {  
    System.out.println("1. (A)dmin Mode");
    System.out.println("2. (C)ustomer Mode");
    System.out.println("3. (E)xit");
    System.out.print("Choice: ");
  }

} // end of Main class
