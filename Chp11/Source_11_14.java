class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    int getPrice() {return price;}
    String getAuthor() {return author;}
    String getTitle() {return title;}

    public int hashCode() {
        return this.title.hashCode() + this.author.hashCode();
    }

    public boolean equals(Object book) {
        if (this == book) {return true;}
        if (book == null) {return false;}
        if (getClass() != book.getClass()) {return false;}
        Book other = (Book) book;
        if(other.title.equals(this.title) && other.author.equals(this.author))
            return true;
        return false;
    }

    public String toString() {
        return ("title: " + this.title + ", author: " + this.author + ", price: " + this.price);
    }
}
public class Source_11_14 {
    
}
