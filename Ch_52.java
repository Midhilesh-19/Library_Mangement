import java.util.ArrayList;

public class Ch_52 {
    ArrayList<String> s= new ArrayList<>();
    ArrayList<String> iss=new ArrayList<>();
    public void addBook(String book){
        s.add(book);
    }
    public void issueBook(String bookName){
        if (s.contains(bookName)) {
            iss.add(bookName);
            s.remove(bookName);
        }
        else {
            System.out.println("Book is not available in the library");
        }

    }
    public void returnBook(String bookName){
        if(iss.contains(bookName)){
            s.add(bookName);
            iss.remove(bookName);
        }
        else{
            System.out.println("Book is not issued from our end");
        }

    }
    public void showAvailableBooks(){
        System.out.println(s);

    }

    public static void main(String[] args) {
        Ch_52 obj=new Ch_52();
        obj.addBook("MARVEL");
        obj.addBook("META-VERSE");
        obj.addBook("DC");
        obj.addBook("BHRAMASTHRA");
        obj.showAvailableBooks();
        obj.returnBook("OKOKJE");
        obj.issueBook("META-VERSE");
        obj.showAvailableBooks();
        obj.issueBook("META-VERSE");
    }
}
