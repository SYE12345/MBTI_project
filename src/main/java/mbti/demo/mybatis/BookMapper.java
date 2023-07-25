package mbti.demo.mybatis;
import mbti.demo.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Optional;

@Mapper
public interface BookMapper {

    void save(Book book);
    List<Book> findAll();
    List<Book> findByAnalystType(RowBounds rowBounds); //분석가형
    List<Book> findByDiplomaticType(RowBounds rowBounds); //외교관형
    List<Book> findByAdministratorType(RowBounds rowBounds); //관리자형
    List<Book> findByExplorerType(RowBounds rowBounds); //탐험가형

    long countTotalBooks();
}
