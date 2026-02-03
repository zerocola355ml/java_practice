import java.util.*;
import java.util.stream.*;

class Book {
    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    int getPrice() {return price;}
    String getAuthor() {return author;}
    String getTitle() {return title;}
}


public class Source_11_13 {
    public static void main(String args[]) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("JAVA 프로그래밍", "홍길동", 10000));
        books.add(new Book("PHP 프로그래밍", "이순신", 20000));
        books.add(new Book("마이크로프로세서 입문", "김유신", 14000));
        books.add(new Book("데이터베이스 입문", "신사임당", 21000));
        books.add(new Book("빅데이터 연구", "유관순", 12000));
        books.add(new Book("커뮤니케이션 이론", "강감찬", 15000));

        double avg = books.stream()
            .mapToInt(book -> book.getPrice())
            .average()
            .getAsDouble();
        System.out.println(avg);
    }    
}
