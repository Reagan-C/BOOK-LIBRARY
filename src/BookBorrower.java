import java.util.ArrayList;
import java.util.Comparator;

public class BookBorrower extends AbstractBaseEntity implements Comparator<BookBorrower> {


        private ArrayList<Book> borrowedBooks;

    public BookBorrower() {

    }

    public BookBorrower(String name, int id, String gender, Role role) {
            super(name, id, gender, role);
            borrowedBooks = new ArrayList<>();
        }


    @Override
    public int compare(BookBorrower o1, BookBorrower o2) {
        if (o1.getRank() == o2.getRank()) {
            return 0;
        } else if (o1.getRank() > o2.getRank()) {
            return 1;
        }else return -1;
    }


}
