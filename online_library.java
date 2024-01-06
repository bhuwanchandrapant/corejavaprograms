
class library{
    String[] books;
    int n0_of_books;
    library(){
        this.books = new String[100];
        this.n0_of_books = 0;

    }
    void addbook(String book){
        this.books[n0_of_books] = book;
        n0_of_books ++;
        System.out.println(book + " has been added");

    }
    void showavailablebooks(){
        System.out.println("available books are:");
        for(String book : this.books){
            if (book == null) {
                continue;
            }
            System.out.println("# " + book);
        }

    }
    void issuebook(String book){
        for(int i =0; i<this.books.length;i++){
            if (this.books[i].equals(book)) {
                System.out.println("the book has been issued");
                this.books[i] =null;
                return;  
            }
        }
        System.out.println("this book does not exist");
    }


    void returnbook(String book){
        addbook(book);

    }
}




public class online_library {
    public static void main(String[] args) {
        library centrallibrary = new library();
        centrallibrary.addbook( "the hidden hindu");
        centrallibrary.addbook( "how to get success");
        centrallibrary.addbook( "nothing");

        centrallibrary.showavailablebooks();
        centrallibrary.issuebook("nothing");
        centrallibrary.showavailablebooks();
        centrallibrary.returnbook("nothing");
        centrallibrary.showavailablebooks();
        centrallibrary.showavailablebooks();


        
    }
}
