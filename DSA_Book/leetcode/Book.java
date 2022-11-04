public class Book {
    int books;
    int book_id;
    String book_name;
    String book_author;
    String publisher;
    int copies;
    double price;

    Book(int books){
        this.books=books;
    }

    Book(int book_id,String book_name,String book_author,String publisher,int copies,double price){
        this.book_id=book_id;
        this.book_name=book_name;
        this.book_author=book_author;
        this.publisher=publisher;
        this.copies=copies;
        this.price=price;
    }
}

