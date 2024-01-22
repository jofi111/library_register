package libreg;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();
    public BookRepository() {
        books.add(new Book("12345", "The Dead of Night", "Horror", null, "S.K. Eleton", 36, 36));
        books.add(new Book("65432", "Cats and dogs in feudal era", "History", null, "R. Fluffy", 55, 12));
        books.add(new Book("74125", "Cosmos circus", "Sci-fi", null, "H. Ofdarkness", 10, 0));
        books.add(new Book("54321", "Whispers in the Dark", "Mystery", null, "A. Shadow", 8, 4));
        books.add(new Book("98765", "Last Stand of the Titans", "Fantasy", null, "G. Mythos", 48, 16));
        books.add(new Book("12389", "Beneath the Ocean's Surface", "Adventure", null, "M. Deep", 22, 5));
        books.add(new Book("67891", "Chronicles of the Lost Empire", "Historical Fiction", null, "E. Ancient", 33, 14));
        books.add(new Book("23456", "Through the Wormhole", "Sci-fi", null, "L. Starwalker", 67, 67));
        books.add(new Book("78901", "Echoes of a Forgotten Realm", "Fantasy", null, "T. Dreamweaver", 45, 20));
        books.add(new Book("34567", "The Enigma of Infinity", "Mystery", null, "P. Puzzle", 51, 10));
        books.add(new Book("89012", "Sands of Time", "Historical Fiction", null, "D. Sands", 30, 8));
        books.add(new Book("45678", "Parallel Universes", "Sci-fi", null, "Q. Quantum", 15, 3));
        books.add(new Book("90123", "The Haunting of Willow House", "Horror", null, "V. Ghostly", 20, 9));
        books.add(new Book("56789", "Galactic Odyssey", "Sci-fi", null, "N. Nebula", 73, 36));
        books.add(new Book("01234", "The Last Pharaoh", "Historical Fiction", null, "C. Cleopatra", 42, 21));
        books.add(new Book("13579", "Mind Over Matter", "Psychology", null, "J. Brain", 62, 31));
        books.add(new Book("24680", "Untold Stories of the Deep", "Adventure", null, "S. Seafarer", 28, 14));
        books.add(new Book("36912", "Code of the Future", "Technology", null, "I. Innovator", 19, 9));
        books.add(new Book("48126", "The Lost World of Atlantis", "Fantasy", null, "A. Atlantis", 47, 23));
        books.add(new Book("59237", "Ghosts of the Civil War", "Historical", null, "W. Warghost", 56, 28));
        books.add(new Book("60448", "Mysteries of the Ancient Temples", "History", null, "K. Khronos", 38, 19));
        books.add(new Book("71559", "The Robot Revolution", "Sci-fi", null, "R. Roboto", 63, 31));
        books.add(new Book("82660", "Journey Through the Stars", "Sci-fi", null, "F. Futura", 16, 8));
        books.add(new Book("11223", "Echoes of the Ancient World", "Historical Fiction", null, "Y. Yesterday", 44, 22));
        books.add(new Book("22434", "The Last Stand of Heroes", "Fantasy", null, "P. Paladin", 54, 27));
        books.add(new Book("33645", "The Enigma of the Stars", "Sci-fi", null, "S. Spacewalker", 29, 14));
        books.add(new Book("44856", "Ghostly Whispers", "Horror", null, "E. Eerie", 37, 18));
        books.add(new Book("55067", "The Forgotten Circus", "Mystery", null, "M. Mysterious", 25, 12));
        books.add(new Book("66278", "Chronicles of the Ocean", "Adventure", null, "D. Deepsea", 34, 17));
        books.add(new Book("77489", "The Cosmos Enigma", "Sci-fi", null, "N. Nova", 49, 24));
        books.add(new Book("88690", "The Parallel Pharaoh", "Historical Fiction", null, "T. Tutankhamun", 60, 30));
        books.add(new Book("99801", "Journey to the Dead World", "Sci-fi", null, "Z. Zephyr", 26, 13));
        books.add(new Book("10912", "Mysteries of the Galactic Empire", "Sci-fi", null, "L. Lightyear", 18, 9));
    }
    public Book findByIsbn(String isbn) {
        for (Book book:books) {
            if (book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }
    public ArrayList<Book> findByTitle(String keyword){
        ArrayList<Book> booksFound=new ArrayList<>();
        for (Book book:books){
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())){         //toLowerCase odstrani case sensitivity z hledani
                booksFound.add(book);
            }
        }
        return booksFound;
    }
}
