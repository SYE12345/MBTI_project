package mbti.demo.service;

import mbti.demo.domain.Movie;
import mbti.demo.repository.MovieSearchCond;

import java.util.List;
import java.util.Optional;

public interface MovieServiceInterface {
    Optional<Movie> findByGenre(String genre);
    List<Movie> findAll();
}
