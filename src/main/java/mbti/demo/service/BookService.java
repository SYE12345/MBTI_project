package mbti.demo.service;
import mbti.demo.domain.Book;
import mbti.demo.repository.BookInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService implements BookServiceInterface{
    private final BookInterface bookInterface;
    @Override
    public Book save(Book book) {
        return bookInterface.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookInterface.findAll();
    }

    @Override
    public List<Book> findByAnalystType() {
        return bookInterface.findByAnalystType();
    }

    @Override
    public List<Book> findByDiplomaticType() {
        return bookInterface.findByDiplomaticType();
    }

    @Override
    public List<Book> findByAdministratorType() {
        return bookInterface.findByAdministratorType();
    }

    @Override
    public List<Book> findByExplorerType() {
        return bookInterface.findByExplorerType();
    }
}
