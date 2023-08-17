package mbti.demo.config;

import lombok.RequiredArgsConstructor;
import mbti.demo.mybatis.*;
import mbti.demo.repository.BestBookInterface;
import mbti.demo.repository.BookInterface;
import mbti.demo.repository.MovieRepository;
import mbti.demo.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {

    private final MovieMapper movieMapper;
    private final BookMapper bookMapper;
    private final BestBookMapper bestBookMapper;


    @Bean
    public MovieServiceInterface movieServiceInterface(){
        return new MovieService(movieRepository(), movieMapper);

    }
    @Bean
    public MovieRepository movieRepository() {
        return new MyBatisMovieRepository(movieMapper);
    }
    @Bean
    public BookServiceInterface bookServiceInterface() {
        return new BookService(bookInterface(), bookMapper);
    }
    @Bean
    public BookInterface bookInterface() {
        return new MyBatisBookRepository(bookMapper);
    }

    @Bean
    public BestBookServiceInterface bestbookServiceInterface() {
        return new BestBookService(bestbookInterface());
    }
    @Bean
    public BestBookInterface bestbookInterface() {
        return new MyBatisBestBookRepository(bestBookMapper);
    }
}


