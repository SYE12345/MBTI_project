package mbti.demo.config;

import lombok.RequiredArgsConstructor;
import mbti.demo.mybatis.BookMapper;
import mbti.demo.mybatis.MovieMapper;
import mbti.demo.mybatis.MyBatisBookRepository;
import mbti.demo.mybatis.MyBatisMovieRepository;
import mbti.demo.repository.BookInterface;
import mbti.demo.repository.MovieRepository;
import mbti.demo.service.BookService;
import mbti.demo.service.BookServiceInterface;
import mbti.demo.service.MovieService;
import mbti.demo.service.MovieServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {

    private final MovieMapper movieMapper;
    private final BookMapper bookMapper;

    @Bean
    public MovieServiceInterface movieServiceInterface(){
        return new MovieService(movieRepository());

    }
    @Bean
    public MovieRepository movieRepository() {
        return new MyBatisMovieRepository(movieMapper);
    }

    @Bean
    public BookInterface bookInterface(){
        return new MyBatisBookRepository(bookMapper);

    }

    @Bean
    public BookServiceInterface bookServiceInterface(){
        return new BookService(bookInterface(),bookMapper);
    }
}
