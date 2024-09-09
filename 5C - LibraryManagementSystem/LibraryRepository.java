package Library;

import java.util.List;

public interface LibraryRepository {
    void addBook(Book book);
    void removeBook(String isbn);
    Book getBook(String isbn);
    List<Book> getAllBooks();

    void addMember(Member member);
    void removeMember(int memberId);
    Member getMember(int memberId);
    List<Member> getAllMembers();
}
