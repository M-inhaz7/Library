
package librarylabperformance;
import java.util.ArrayList;

class Member{
    private int id;
    private String name;
    Member(int i, String n){
        id = i;
        name = n;
    }
}
class Library{
    ArrayList<Hard_copy> h = new ArrayList<Hard_copy>();
    ArrayList<Audio_Books> a = new ArrayList<Audio_Books>();
    void listHard(Hard_copy h1){
        h.add(h1);
    }
    void listAudio(Audio_Books h1){
        a.add(h1);
    }
}
class Book{
    private int book_id;
    private String Book_title;
    private String Author;
    private int price;
    Book(int book_id,String Book_title,String Author,int price){
        this.book_id=book_id;
        this.Book_title=Book_title;
        this.Author=Author;
        this.price=price;
    }
}
class Hard_copy extends Book{
    ArrayList<Member> m = new ArrayList<Member>();
    int No_of_pages;
    Hard_copy(int book_id,String Book_title,String Author,int price,int No_of_pages){
        super(book_id,Book_title,Author,price);
        this.No_of_pages=No_of_pages;
    }
}
class Audio_Books extends Book{
    ArrayList<Member> h = new ArrayList<Member>();
    int duration_of_audio;
    Audio_Books(int book_id,String Book_title,String Author,int price,int duration){
        super(book_id,Book_title,Author,price);
        duration_of_audio = duration;
    }
}
class Admin{
    
}
public class LibraryLABperformance {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
