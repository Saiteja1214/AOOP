package Library;

public class BorrowingServiceImpl implements BorrowingService {
    private final LibraryRepository libraryRepository;

    public BorrowingServiceImpl(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @Override
    public boolean borrowBook(int memberId, String isbn) {
        Member member = libraryRepository.getMember(memberId);
        Book book = libraryRepository.getBook(isbn);

        if (member != null && book != null && book.isAvailable()) {
            member.borrowBook(book);
            book.setAvailable(false);
            return true;
        }
        return false;
    }

    @Override
    public boolean returnBook(int memberId, String isbn) {
        Member member = libraryRepository.getMember(memberId);
        Book book = libraryRepository.getBook(isbn);

        if (member != null && book != null && !book.isAvailable()) {
            member.returnBook(book);
            book.setAvailable(true);
            return true;
        }
        return false;
    }
}
