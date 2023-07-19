package mbti.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Movie;
import mbti.demo.repository.MovieRepository;
import mbti.demo.repository.MovieSearchCond;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MovieService implements MovieServiceInterface {

    private final MovieRepository movieRepository;

    @Override
    public Optional<Movie> findByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }

    @Override
    public List<Movie> findAll() {
        System.out.println("서비스 실행");
        return movieRepository.findAll();
    }
}
