package mbti.demo.config;

import lombok.RequiredArgsConstructor;
import mbti.demo.mybatis.MovieMapper;
import mbti.demo.mybatis.MyBatisMovieRepository;
import mbti.demo.repository.MovieRepository;
import mbti.demo.service.MovieService;
import mbti.demo.service.MovieServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {

    private final MovieMapper movieMapper;

    @Bean
    public MovieServiceInterface movieServiceInterface(){
        return new MovieService(movieRepository());

    }
    @Bean
    public MovieRepository movieRepository() {
        return new MyBatisMovieRepository(movieMapper);
    }
}
