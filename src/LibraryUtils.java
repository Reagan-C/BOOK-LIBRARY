import java.util.*;

public  class LibraryUtils<T> {

    //  A collection to hold all books in the library
    public static ArrayList<Book> availableBooks = new ArrayList<>();
    public static Queue<BookBorrower> bookWaitingQueue = new PriorityQueue<>(new BookBorrower());


    public static <T>void addBook(Book book, T t) {
        if (t instanceof Librarian) {
            boolean exists = false;
            for (Book b : availableBooks) {
                if (b.getName().equalsIgnoreCase(book.getName()) &&
                    b.getAuthor().equalsIgnoreCase(book.getAuthor()) &&
                    b.getpublishedBy().equalsIgnoreCase(book.getpublishedBy()) &&
                    b.getyearOfPublishing() == book.getyearOfPublishing()) {
                    b.setNoOfCopies(b.getNoOfCopies() + book.getNoOfCopies());
                    exists = true;
                    break;
                }
            }
            if (!exists && book.getNoOfCopies() > 0) availableBooks.add(book);
        } else {
            System.out.println("Only the Librarian can add a book to the library");
        }
    }

    public static <T>void borrowBook (Book book, T t) {
        boolean isTrue = false;
        if (!bookWaitingQueue.isEmpty()) {
            for (Book b : availableBooks) {
                if (b.getName().equalsIgnoreCase(book.getName()) &&
                        b.getAuthor().equalsIgnoreCase(book.getAuthor()) && b.getNoOfCopies() > 0) {
                    isTrue = true;
                    System.out.println("Checking eligibility...");
                    System.out.println("NB: Teacher is prioritised first. Senior student is prioritised after teacher while Junior student comes last.");
                    System.out.println("Proceed to take the book, "+book.getName() +", as a " + bookWaitingQueue.peek().getRole());
                    bookWaitingQueue.poll();
                    b.setNoOfCopies(b.getNoOfCopies() - 1);
                    }
                    break;
                }
            if (!isTrue) {
                System.out.println("Book taken");
                bookWaitingQueue.remove();
            }
        } else {
            System.out.println("Kindly add a book borrower to the queue");
        }
    }
}