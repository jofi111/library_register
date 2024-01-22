package libreg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LibraryRegister app = new LibraryRegister();
        app.searchByIsbn("12345");
        app.searchByIsbn("65433");
        app.searchByTitle("Echoes");
        app.searchByTitle("enigma");
        app.searchByTitle("pig");
        app.checkOutBook("12345");
        app.checkOutBook("65433");
        app.checkInBook("12345");
        app.checkInBook("65433");
        app.checkOutBook("54321");
        app.checkOutBook("54321");
        app.checkOutBook("54321");
        app.checkOutBook("54321");
        app.checkOutBook("54321");
        app.searchByTitle("Galactic");
    }
}


//keyword examples: "Echoes," "Last," "Enigma," ," "Circus," "Chronicles," "Cosmos," "Parallel," "Dead," and "Galactic"