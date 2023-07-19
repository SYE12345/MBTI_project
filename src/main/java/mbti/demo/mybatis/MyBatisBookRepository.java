package mbti.demo.mybatis;
import mbti.demo.domain.Book;
import mbti.demo.repository.BookInterface;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MyBatisBookRepository implements BookInterface {
    private final BookMapper bookMemberMapper;


    @Override
    public Book save(Book book) {
        bookMemberMapper.save(book);
        return book;
    }

    @Override
    public List<Book> findAll() {
        return bookMemberMapper.findAll();
    }

    @Override
    public List<Book> findByAnalystType() {
        return bookMemberMapper.findByAnalystType();
    }

    @Override
    public List<Book> findByDiplomaticType() {
        return bookMemberMapper.findByDiplomaticType();
    }

    @Override
    public List<Book> findByAdministratorType() {
        return bookMemberMapper.findByAdministratorType();
    }

    @Override
    public List<Book> findByExplorerType() {
        return bookMemberMapper.findByExplorerType();
    }
}
