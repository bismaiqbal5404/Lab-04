package group.lab_04_ex_03;

public class Lab_04_Ex_03 {

    static class Book {
    
        private String title;
        private String author;
        private double price;

        public Book(String title, String author, double price) {
            this.title = title;    
            this.author = author; 
            this.price = price;    
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public String getTitle() {
            return title;
        }
        public String getAuthor() {
            return author;
        }
        public double getPrice() {
            return price;
        }
        public String toString() {
            return "Book Title: " + title + "\nAuthor: " + author + "\nPrice: Rs" + price;
        }
    }
    public static void main(String[] args) {
        Book book = new Book("Computer", "John William", 2000);
        System.out.println(book.toString());
        System.out.println("\nName: Syeda Bisma Iqbal");
    }
}
