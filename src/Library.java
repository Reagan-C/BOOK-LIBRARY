import java.util.ArrayList;

public class Library {
   private String name;
   private String address;

   private String nameOfLibrarian;
   private ArrayList<Book> books;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getNameOfLibrarian() {
        return nameOfLibrarian;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setNameOfLibrarian(String nameOfLibrarian) {
        this.nameOfLibrarian = nameOfLibrarian;
    }

    @Override
    public String toString() {
        return "Library{" +
                "Name='" + name + '\'' +
                ", Address='" + address + '\'' +
                ", Name of Librarian='" + nameOfLibrarian + '\'' +
                ", Books=" + books +
                '}';
    }

}
