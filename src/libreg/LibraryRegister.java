package libreg;

import java.util.ArrayList;

public class LibraryRegister {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn){
        System.out.printf("Searching for book with ISBN %s.\n", isbn);
        Book book = bookRepo.findByIsbn(isbn);{
            if (book !=null) {
                System.out.printf("This book found: \n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(),book.getGenre(),book.getAuthor());
            }
            else {
                System.out.println("No such book found.");
            }
            System.out.print("\n\n");
        }
    }

    public void searchByTitle(String keyword) {
        System.out.printf("Searching for book with '%s' in the title...\n", keyword);
        ArrayList<Book> books = bookRepo.findByTitle(keyword);
        System.out.printf("%s books found%s\n", books.size(), books.size() > 0 ? ":" : ".");           //size sdeli pocet vyskytu v arraylistu
        for (Book book:books){
            System.out.printf("\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n", book.getTitle(),book.getGenre(),book.getAuthor());
        }
        System.out.println();
    }

    public void checkOutBook(String isbn){
        Book book=bookRepo.findByIsbn(isbn);
        if (book !=null) {
            if (book.checkOut()){
                System.out.println("Check out SUCCESSFUL:");
                System.out.printf("\tISBN: %s\n\tTitle: %s\n\tAuthor: %s\n\t---\n",book.getIsbn(), book.getTitle(),book.getAuthor());
            }
            else {
                System.out.println("Check out FAILED:");
                System.out.printf("\tISBN: %s\n\tTitle: %s\n\tAuthor: %s\n\t---\n",book.getIsbn(), book.getTitle(),book.getAuthor());
                System.out.printf("Reason: More books checked out than recorded quantity.\n");
            }

        }
        else {
            System.out.printf("Failed to check out book.\n");
            System.out.printf("Reason: There is no book with ISBN %s on record.\n", isbn);
        }
        System.out.println();
    }
    public void checkInBook(String isbn){
        Book book=bookRepo.findByIsbn(isbn);
        if (book !=null) {
            book.checkIn();
            System.out.println("Book checked in successfully:");
            System.out.printf("\tISBN: %s\n\tTitle: %s\n\tAuthor: %s\n\t---\n",book.getIsbn(), book.getTitle(),book.getAuthor());
        }
        else {
            System.out.printf("Failed to check in book.\n");
            System.out.printf("Reason: There is no book with ISBN %s on record.\n", isbn);
        }
        System.out.println();
    }
}
