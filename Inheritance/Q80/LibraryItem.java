// 80 Start with base class LibraryItem that include common attributes like itemID,title, and author and methods like checkout()
//  and returnitems().Create subclass such as book,magazine, and dvd each inheriting from libraryitem.
// Add unique attribute to each subclass like isbn for book,isssueNumber


package Inheritance.Q80;

public class LibraryItem {
    
    private String itemId;
    private String title;
    private String author;

    public void checkout(){
        System.out.println("Checkout");
    }

    public void returnItem(){
        System.out.println("Returing the items");
    }

}
