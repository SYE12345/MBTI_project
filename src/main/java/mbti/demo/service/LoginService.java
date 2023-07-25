package mbti.demo.service;

import lombok.RequiredArgsConstructor;
import mbti.demo.domain.Drama;
import mbti.demo.domain.Login;
import mbti.demo.repository.DramaRepository;
import mbti.demo.repository.LoginRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoginService implements LoginServi{

    private final LoginRepository loginRepository;

    public List<Login> getAllId() {
        return loginRepository.getAllId();
    }
}
