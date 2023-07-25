package mbti.demo.service;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Book;
import mbti.demo.repository.BookInterface;
import mbti.demo.mybatis.BookMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.RowBounds;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookService implements BookServiceInterface{
    private final BookInterface bookInterface;
    private final BookMapper bookMapper;

    @Override
    public Book save(Book book) {
        return bookInterface.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookInterface.findAll();
    }

    @Override
    public Page<Book> findByAnalystType(Pageable pageable) {
        int offset = pageable.getPageNumber() * pageable.getPageSize();
        int limit = pageable.getPageSize();
        RowBounds rowBounds = new RowBounds(offset, limit);
        List<Book> bookList = bookMapper.findByAnalystType(rowBounds);
        long totalCount = bookMapper.countTotalBooks();

        return new PageImpl<>(bookList, pageable,totalCount);
    }

    @Override
    public Page<Book> findByDiplomaticType(Pageable pageable) {
        int offset = pageable.getPageNumber() * pageable.getPageSize();
        int limit = pageable.getPageSize();
        RowBounds rowBounds = new RowBounds(offset, limit);
        List<Book> bookList = bookMapper.findByDiplomaticType(rowBounds);
        long totalCount = bookMapper.countTotalBooks();

        return new PageImpl<>(bookList, pageable,totalCount);
    }

    @Override
    public Page<Book> findByAdministratorType(Pageable pageable) {
        int offset = pageable.getPageNumber() * pageable.getPageSize();
        int limit = pageable.getPageSize();
        RowBounds rowBounds = new RowBounds(offset, limit);
        List<Book> bookList = bookMapper.findByAdministratorType(rowBounds);
        long totalCount = bookMapper.countTotalBooks();

        return new PageImpl<>(bookList, pageable,totalCount);
    }

    @Override
    public Page<Book> findByExplorerType(Pageable pageable) {
        int offset = pageable.getPageNumber() * pageable.getPageSize();
        int limit = pageable.getPageSize();
        RowBounds rowBounds = new RowBounds(offset, limit);
        List<Book> bookList = bookMapper.findByExplorerType(rowBounds);
        long totalCount = bookMapper.countTotalBooks();

        return new PageImpl<>(bookList, pageable,totalCount);
    }
}
