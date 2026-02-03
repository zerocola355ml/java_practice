import java.util.*;

class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getPrice() {
        return price;
    }
}

public class Source_11_20 {
    public static void main(String args[]) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("PHP 프로그래밍", "이순신", 20000));
        books.add(new Book("마이크로프로세서 입문", "김유신", 14000));
        books.add(new Book("데이터베이스 입문", "신사임당", 21000));
        books.add(new Book("빅데이터연구", "유관순", 12000));
        books.add(new Book("커뮤니케이션 이론", "강감찬", 15000));

        books.stream()
            .map(book -> book.getTitle())
            .forEach(item -> System.out.println(item));
        books.stream()
            .map(book -> book.getAuthor())
            .forEach(item -> System.out.println(item));
        books.stream()
            .map(book -> book.getPrice())
            .forEach(item -> System.out.println(item));

    }
    
}
