package Library;

public interface BorrowingService {
    boolean borrowBook(int memberId, String isbn);
    boolean returnBook(int memberId, String isbn);
}
