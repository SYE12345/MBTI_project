package mbti.demo.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.mybatis.*;
import mbti.demo.repository.CulturalRepository;
import mbti.demo.repository.DramaRepository;
import mbti.demo.service.CulturalService;
import mbti.demo.repository.MuseumRepository;
import mbti.demo.service.DramaService;
import mbti.demo.service.MuseumService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class DramaCon {
    private final DramaMapper dramaMapper;
    private final MuseumMapper museumMapper;
    private final CulturalMapper culturalMapper;

    @Bean
    public DramaRepository dramaRepository() {
        return new MyBatisDramaRepository(dramaMapper);
    }
    @Bean
    public DramaService dramaService() {
        return new DramaService(dramaRepository());
    }
    @Bean
    public MuseumRepository museumRepository() {
        return new MyBatisMuseumRepository(museumMapper);
    }
    @Bean
    public MuseumService museumService() {
        return new MuseumService(museumRepository());
    }
    @Bean
    public CulturalRepository culturalRepository() {
        return new MyBatisCulturalRepository(culturalMapper);
    }
    @Bean
    public CulturalService culturalService() {
        return new CulturalService(culturalRepository());
    }
}
