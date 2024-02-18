
           
 
package bookcheckout;
import java.util.Scanner;

public class BookCheckOut {
    int n_books;
 
  
   public static void main(String[] args) {
       
       String book_name = null;
       Scanner a=new Scanner(System.in);
       Scanner b=new Scanner(System.in);
       System.out.println("Enter number of books you need");
       
       int n_books=a.nextInt();
       
           
           if(n_books<=3){
               
               for(int i=1;i<=n_books;i++){
                  
          System.out.println("Enter name of Book" +i);
          book_name=b.nextLine();
      
           }}
           else{
                       
                    System.out.println("Maxmum number of book is 3");  
                       }
               
           }
   }
      
   
