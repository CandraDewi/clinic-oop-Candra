/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package candramanikadewi.guided;

/**
 *
 * @author REDMI
 */
public class LibraryBook {

    private String title;
    private String author;
    private boolean isBorrowed;
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setIsBorrowed (boolean bool){
        this.isBorrowed = bool;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public boolean getStatus(){
        return isBorrowed;
    }
    
    public static void main(String args[]){
        LibraryBook lb = new LibraryBook();
        lb.setTitle("Jejak Petualang");
        lb.setAuthor("Hamzah");
        lb.setIsBorrowed(true);
        System.out.println("Title: " + lb.title);
        System.out.println("Author: " + lb.author);
        System.out.println("Is Borrowed: " + lb.isBorrowed);
    }
    
}
