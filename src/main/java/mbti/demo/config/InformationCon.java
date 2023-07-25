package mbti.demo.config;

import lombok.RequiredArgsConstructor;
import mbti.demo.mybatis.InformationMapper;
import mbti.demo.mybatis.MybatisInformationRepository;
import mbti.demo.repository.InformationInterface;
import mbti.demo.service.InformationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class InformationCon {
    private final InformationMapper informationMapper;

    @Bean
    public InformationInterface informationInterface(){
        return new MybatisInformationRepository(informationMapper);
    }

    @Bean
    public InformationService informationServiceInterface(){
        return new InformationService(informationInterface());
    }
}
