package mbti.demo.mybatis;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Movie;
import mbti.demo.repository.MovieRepository;
import mbti.demo.repository.MovieSearchCond;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Slf4j
public class MyBatisMovieRepository implements MovieRepository {
    private final MovieMapper movieMapper;

    @Override
    public Optional<Movie> findByGenre(String genre) {

        return movieMapper.findByGenre(genre);
    }

    @Override
    public List<Movie> findAll() {
        return movieMapper.findAll();
    }
//    dd 하zzzz
}
