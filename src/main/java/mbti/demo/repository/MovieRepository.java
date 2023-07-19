package mbti.demo.repository;

import mbti.demo.domain.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieRepository {
    Optional<Movie> findByGenre(String genre);
    List<Movie> findAll();
}
