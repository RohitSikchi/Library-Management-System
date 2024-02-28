
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" has been added!");
    }
    void showAvailablebooks(){
          System.out.println("available books are:");
          for(String book:this.books){
            if(book==null){
                continue;
            }
            System.out.println("* "+book);
          }
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("the book has been issued!");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("this book not exist ");
    }
    void retuenBook(String book){
        addBook(book);
    }
}

public class libraryms {
    public static void main(String[] args){
      Library centraLibrary=new Library();
      centraLibrary.addBook("think and grow rich");
      centraLibrary.addBook("algorithm");
      centraLibrary.addBook("c++");

      centraLibrary.showAvailablebooks();

      centraLibrary.issueBook("c++");
      centraLibrary.showAvailablebooks();
      centraLibrary.retuenBook("c++");
      centraLibrary.showAvailablebooks();
    }
}

