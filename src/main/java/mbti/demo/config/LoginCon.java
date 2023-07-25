package mbti.demo.config;

import lombok.RequiredArgsConstructor;
<<<<<<< HEAD
import lombok.extern.slf4j.Slf4j;
import mbti.demo.mybatis.*;
import mbti.demo.repository.CulturalRepository;
import mbti.demo.repository.DramaRepository;
import mbti.demo.repository.LoginRepository;
import mbti.demo.repository.MuseumRepository;
import mbti.demo.service.CulturalService;
import mbti.demo.service.DramaService;
import mbti.demo.service.LoginService;
import mbti.demo.service.MuseumService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class LoginCon {
    private final LoginMapper loginMapper;


    @Bean
    public LoginRepository loginRepository() {
        return new MyBatisLoginRepository(loginMapper);
    }
    @Bean
    public LoginService loginService() {
        return new LoginService(loginRepository());
    }

}
=======
import mbti.demo.mybatis.MemberMapper;
import mbti.demo.mybatis.MybatisMemberRepository;
import mbti.demo.repository.MemberInterface;
import mbti.demo.service.LoginInterface;
import mbti.demo.service.LoginService;
import mbti.demo.service.MemberService;
import mbti.demo.service.MemberServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@RequiredArgsConstructor
public class LoginCon {
    private final MemberMapper memberMapper;

    @Bean
    public LoginInterface loginInterface () {
        return new LoginService(memberServiceInterface());
    }
    @Bean
    public MemberServiceInterface memberServiceInterface() {
        return new MemberService(memberInterface());
    }
    @Bean
    public MemberInterface memberInterface() {
        return new MybatisMemberRepository(memberMapper);
    }
}
>>>>>>> jun/master
