package mbti.demo.service;

import mbti.demo.domain.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface MovieServiceInterface {
    Optional<Movie> findByGenre(String genre);
    // 일반
//    List<Movie> findByAnalystType();
    // 페이징용
    Page<Movie> findByAnalystType(Pageable pageable);

    // 일반
//    List<Movie> findByDiplomaticType();
    // 페이징용
    Page<Movie> findByDiplomaticType(Pageable pageable);

    // 일반
//    List<Movie> findByAdministratorType();
    // 페이징용
    Page<Movie> findByAdministratorType(Pageable pageable);

    // 일반
//    List<Movie> findByExplorerType();
    // 페이징용
    Page<Movie> findByExplorerType(Pageable pageable);

    // 일반
//    List<Movie> findAll();
    // 페이징용
    Page<Movie> findMoviesWithPaging(Pageable pageable);
}
