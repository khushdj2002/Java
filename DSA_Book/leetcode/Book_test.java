import java.util.Scanner;

public class Book_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book(sc.nextInt());

        Book arr[] = new Book[b1.books];

        for (int i = 0; i < b1.books; i++) {
            arr[i]=new Book(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
        }

        for (int i = 0; i < b1.books; i++) {
            if(arr[i].price>500){
                arr[i].price=arr[i].price+(arr[i].price/10);
                System.out.println(arr[i].book_name+"  "+arr[i].price);
            }
            else {
                arr[i].price=arr[i].price+(arr[i].price/20);
                System.out.println(arr[i].book_name+"  "+arr[i].price);
            }
        }
    }
}
