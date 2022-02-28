import java.util.*;

class Book {
    int id;
    String name;
    String author;
    String publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;

    }
}

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Book> set = new HashSet<Book>();
        // Creating books
        Book b1 = new Book(1, "let us c", "yashwanth", "BPB", 8);
        Book b2 = new Book(2, "operating systems", "galvin wiley", "YKC", 6);

        // Adding books to hashset
        set.add(b1);
        set.add(b2);

        // Traversing through hashset
        for (Book b : set) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.contains(b1.name) || s.contains(b2.name)) {
            System.out.println(s + " is present in the set");
        } else {
            System.out.println(s + " is not present in the set");
        }
    }
}
