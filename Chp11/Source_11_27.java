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

    public String toString() {
        return("title : " + this.title + ", author : " + this.author + ", price : " + this.price);
    }
}


public class Source_11_27 {
    public static void main(String args[]) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("JAVA 프로그래밍", "홍길동", 10000));
        books.add(new Book("PHP 프로그래밍", "이순신", 20000));
        books.add(new Book("마이크로프로세서 입문", "김유신", 14000));
        books.add(new Book("데이터베이스 입문", "신사임당", 21000));
        books.add(new Book("빅데이터 연구", "유관순", 12000));
        books.add(new Book("커뮤니케이션 이론", "강감찬", 15000));
        books.add(new Book("PHP 프로그래밍", "이순신", 20000));
        books.add(new Book("알고리즘", "권율", 17000));

        books.stream()
            .peek(book -> System.out.println(book))
            .anyMatch(m -> m.price > 20000);
    }
}
