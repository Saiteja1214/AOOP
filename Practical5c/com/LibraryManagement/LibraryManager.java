
import java.util.*;

class LibraryManager implements BookOperations, MemberOperations {
    private List<Book> books;
    private List<Member> members;

    public LibraryManager() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        Book.add(book);
    }

    @Override
    public Optional<Book> findBookById(int bookId) {
        return Book.stream().filter(b -> b.getBookId() == bookId);
    }

    @Override
    public void addMember(Member member) {
        Member.addMember(member);
    }

    @Override
    public Optional<Member> findMemberById(int memberId) {
    }
}