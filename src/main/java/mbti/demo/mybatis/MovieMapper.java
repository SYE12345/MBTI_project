package mbti.demo.mybatis;

import mbti.demo.domain.Movie;
import mbti.demo.repository.MovieSearchCond;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper

public interface MovieMapper {
    Optional<Movie> findByGenre(String genre);
    List<Movie> findAll();
}
