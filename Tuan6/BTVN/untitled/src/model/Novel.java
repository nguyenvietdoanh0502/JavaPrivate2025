package model;

public class Novel extends Book{
    public String genre;

    public Novel(String author, String title, double price, int quantity, String genre) {
        super(author, title, price, quantity);
        this.genre = genre;
    }

    public Novel() {
        super();
        this.genre = "";
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Novel{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", genre=" + genre +
                '}');
    }
}
