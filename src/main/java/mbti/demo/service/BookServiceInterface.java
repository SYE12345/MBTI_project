package mbti.demo.service;
import mbti.demo.domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
public interface BookServiceInterface {
    Book save(Book book);
    List<Book> findAll();
    Page<Book> findByAnalystType(Pageable pageable); //분석가형
    Page<Book> findByDiplomaticType(Pageable pageable); //외교관형
    Page<Book> findByAdministratorType(Pageable pageable); //관리자형
    Page<Book> findByExplorerType(Pageable pageable); //탐험가형
}
