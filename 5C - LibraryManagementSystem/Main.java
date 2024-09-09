package Library;

public class Main {
    public static void main(String[] args) {
        LibraryRepository repository = new InMemoryLibraryRepository();
        BorrowingService borrowingService = new BorrowingServiceImpl(repository);

        // Adding books
        Book book1 = new Book("123", "Java Programming", "John Doe");
        Book book2 = new Book("456", "Data Structures", "Jane Smith");
        repository.addBook(book1);
        repository.addBook(book2);

        // Adding members
        Member member1 = new Member(1, "Alice");
        Member member2 = new Member(2, "Bob");
        repository.addMember(member1);
        repository.addMember(member2);

        // Borrowing a book
        borrowingService.borrowBook(1, "123");
        System.out.println("Alice's borrowed books: " + member1.getBorrowedBooks());

        // Returning a book
        borrowingService.returnBook(1, "123");
        System.out.println("Alice's borrowed books after returning: " + member1.getBorrowedBooks());

        // Display all books and members
        System.out.println("All Books:");
        repository.getAllBooks().forEach(System.out::println);

        System.out.println("All Members:");
        repository.getAllMembers().forEach(System.out::println);
    }
}
