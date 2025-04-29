
import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        // --- Дасгал 1 ---
        System.out.println("=== Дасгал 1 ===");
        List<Animal> destination = new ArrayList<>();
        List<Lion> lions = List.of(new Lion("Арслан"));
        List<Crane> cranes = List.of(new Crane("Тогоруу"));
        Zoo<Animal> zoo = new Zoo<>();
        zoo.transferAnimals(lions, destination);
        zoo.transferAnimals(cranes, destination);
        destination.forEach(animal -> System.out.println(animal.getName()));

        // --- Дасгал 2 ---
        System.out.println("\n=== Дасгал 2 ===");
        Library lib = new Library();
        lib.addBook(new Book("Сүүн Зам", 2020));
        lib.addBook(new Book("Хуучны Ном", 1995));
        Library.BookShelf shelf = lib.new BookShelf(2000);
        for (Book book : shelf) {
            System.out.println(book.getTitle() + ": " + book.getYear());
        }

        // --- Дасгал 3 ---
        System.out.println("\n=== Дасгал 3 ===");
        List<String> words = List.of("Мандах", "Гаршил", "Програмчлал");
        Predicate<String> filter = s -> s.length() > 5;
        Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();
        Consumer<String> print = s -> System.out.println("ГАРШИЛ: " + s.toUpperCase());
        StringProcessor.processStrings(words, filter, reverse, print);

        // --- Дасгал 4 ---
        System.out.println("\n=== Дасгал 4 ===");
        List<Product> products = List.of(
                new Product("Гутал", 1500, "Хувцас"),
                new Product("Цамц", 1200, "Хувцас"),
                new Product("Будаа", 800, "Хоол")
        );
        Map<String, List<Product>> grouped = ProductAnalyzer.analyze(products);
        grouped.forEach((category, items) -> System.out.println(category + ": " + items));
    }
}
