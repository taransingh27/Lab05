package lab05;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no. of which you want to enter data");
        int n = obj.nextInt();
        obj.nextLine().trim();
        Detail[] details = new Detail[n];
        for (int i = 0; i < n; i++) {
            String bookname = obj.nextLine().trim();
            String authorname = obj.nextLine().trim();
            int isbn = obj.nextInt();
            obj.nextLine().trim();
            details[i] = new Detail(bookname, authorname, isbn);
        }
        for (Detail Details : details)
            System.out.println(Details);
    }
}

class Detail {
    String bookname;
    String authorname;
    int isbn;

    public Detail(String bookname, String authorname, int isbn) {
        this.bookname = bookname;
        this.authorname = authorname;
        this.isbn = isbn;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "---------------------\nBookname :" + getBookname() + "\nAuthorname :" + getAuthorname() + "\nISBN :" + getIsbn() + "\n---------------------";
    }

}


