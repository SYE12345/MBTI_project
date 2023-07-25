package mbti.demo.repository;
import mbti.demo.domain.Book;

import java.util.List;

public interface BookInterface {

    Book save(Book book);
    List<Book> findAll();
    List<Book> findByAnalystType(int offset, int limit); //분석가형
    List<Book> findByDiplomaticType(int offset, int limit); //외교관형
    List<Book> findByAdministratorType(int offset, int limit); //관리자형
    List<Book> findByExplorerType(int offset, int limit); //탐험가형

}
