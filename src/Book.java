import java.util.ArrayList;

public class Book {
    private String name;
    private long yearOfPublishing;
    private String publishedBy;
    private   int  noOfCopies;
    private String author;


    public Book(String name, long yearOfPublishing, String publishedBy, int noOfCopies, String author) {
        this.name = name;
        this.yearOfPublishing = yearOfPublishing;
        this.publishedBy = publishedBy;
        this.noOfCopies = noOfCopies;
        this.author = author;
    }
    public String getName() {
        return name;
    }

    public long getyearOfPublishing() {
        return yearOfPublishing;
    }

    public String getpublishedBy() {
        return publishedBy;
    }

    public String getAuthor() {
        return author;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name= " + name +
                ", Year of Publishing=" + yearOfPublishing +
                ", Published by='" + publishedBy + '\'' +
                ", Number of Copies=" + noOfCopies +
                '}';
    }
}
