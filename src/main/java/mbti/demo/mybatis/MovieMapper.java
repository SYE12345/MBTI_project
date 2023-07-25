package mbti.demo.mybatis;

import mbti.demo.domain.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Optional;

@Mapper

public interface MovieMapper {
    Optional<Movie> findByGenre(String genre);

    // 일반
//    List<Movie> findByAnalystType();
    // 페이징용
    List<Movie> findByAnalystType(RowBounds rowBounds);

    // 일반
//    List<Movie> findByDiplomaticType();
    // 페이징용
    List<Movie> findByDiplomaticType(RowBounds rowBounds);

    // 일반
//    List<Movie> findByAdministratorType();
    // 페이징용
    List<Movie> findByAdministratorType(RowBounds rowBounds);

    // 일반
//    List<Movie> findByExplorerType();
    // 페이징용
    List<Movie> findByExplorerType(RowBounds rowBounds);

    // 일반
//    List<Movie> findAll();
    // 페이징용
    List<Movie> findMoviesWithPaging(RowBounds rowBounds);

    // 페이징을 위한 신규 추가
    long countTotalMovies();

}
