package Inheritance.Q80;

public class test extends LibraryItem{
    
    public static void main(String[] args) {
        
    LibraryItem lib = new LibraryItem();
    magzine mag = new magzine();
    mag.returnItem();
    
    book Book = new book();
    dvd Dvd = new dvd();
    lib.checkout();
    lib.returnItem();
    }
    


}
