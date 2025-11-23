package model;

public class TextBook extends Book{
    public String subject;

    public TextBook(String author, String title, double price, int quantity, String subject) {
        super(author, title, price, quantity);
        this.subject = subject;
    }

    public TextBook() {
        super();
        this.subject = "";
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("TextBook{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", subject=" +subject +
                '}');
    }
}
