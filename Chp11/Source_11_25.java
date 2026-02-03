class Book implements Comparable<Book> {
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

    public int compareTo(Book book) {
        return Integer.compare(this.price, book.price);
    }

}
