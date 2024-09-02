import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Thre
class Book implements Comparable<Book> {
    private int id;
    private String title;
    private String author;
    private String publisher;

    public Book(int id, String title, String author, String publisher) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public int compareTo(Book other) {
        return this.id - other.id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}

class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
}

public class Three {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Book A", "Author A", "Publisher A"));
        books.add(new Book(3, "Book C", "Author C", "Publisher C"));
        books.add(new Book(2, "Book B", "Author B", "Publisher B"));

        // Sorting using Comparable
        Collections.sort(books);
        System.out.println("Sorted books using Comparable:");
        for (Book book : books) {
            System.out.println(book);
        }

        // Sorting using Comparator
        Collections.sort(books, new BookComparator());
        System.out.println("Sorted books using Comparator:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}