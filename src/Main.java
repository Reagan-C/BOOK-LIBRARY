public class Main{

    public static void main(String[] args) {
        Book book1 = new Book("General Physics", 2001, "University Press", 4, "Emeka");
        Book book2 = new Book("General Maths", 2008, "University Press", 2, "Obi");
        Book book3 = new Book("General Biology", 2010, "University Press", 9, "Ndu");
        Book book4 = new Book("General Biology", 2010, "University Press", 6, "Ndu");

        Librarian librarian = new Librarian("Phil", 1, "Male", Role.LIBRARIAN);


        BookBorrower teacher1 = new BookBorrower("Eden", 1, "Male", Role.TEACHER);
        BookBorrower teacher2 = new BookBorrower("Neville", 2, "Male", Role.TEACHER);

        BookBorrower student1 = new BookBorrower("Kings", 1, "Male", Role.SENIOR_STUDENT);
        BookBorrower student2 = new BookBorrower("Kate", 2, "Female", Role.JUNIOR_STUDENT);

        // Trying to add a book to the library with another person who is not the librarian(Only the libratrian can add book).
        LibraryUtils.addBook(book1,student1);
        // Adding of 3 books to the library by the librarian
        LibraryUtils.addBook(book2,librarian);
        LibraryUtils.addBook(book3,librarian);
        LibraryUtils.addBook(book4,librarian);

        System.out.println(LibraryUtils.availableBooks.size());//checking the books array size after book addition
        System.out.println(LibraryUtils.availableBooks.toString());

        //Adding individuals to the book waiting queue in order to  borrow a book
        LibraryUtils.bookWaitingQueue.add(student1);
        LibraryUtils.bookWaitingQueue.add(student2);
        LibraryUtils.bookWaitingQueue.add(teacher1);

        System.out.println(LibraryUtils.bookWaitingQueue.size());//Checking the array size to confirm a non-empty queue

        LibraryUtils.borrowBook(book2,student2);// Trying to borrow a book with a junior student when a teacher and senior student are in the waiting queue. Teacher was prioritised first.
        System.out.println(LibraryUtils.bookWaitingQueue.size());// Checking book waiting queue size after first borrow request
        LibraryUtils.borrowBook(book2,student2);
        System.out.println(LibraryUtils.bookWaitingQueue.size());
        LibraryUtils.borrowBook(book2,student2);
        System.out.println(LibraryUtils.bookWaitingQueue.size());

    }
}