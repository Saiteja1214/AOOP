package Library;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class InMemoryLibraryRepository implements LibraryRepository {
    private final Map<String, Book> books = new HashMap<>();
    private final Map<Integer, Member> members = new HashMap<>();

    @Override
    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    @Override
    public void removeBook(String isbn) {
        books.remove(isbn);
    }

    @Override
    public Book getBook(String isbn) {
        return books.get(isbn);
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    @Override
    public void addMember(Member member) {
        members.put(member.getId(), member);
    }

    @Override
    public void removeMember(int memberId) {
        members.remove(memberId);
    }

    @Override
    public Member getMember(int memberId) {
        return members.get(memberId);
    }

    @Override
    public List<Member> getAllMembers() {
        return new ArrayList<>(members.values());
    }
}
