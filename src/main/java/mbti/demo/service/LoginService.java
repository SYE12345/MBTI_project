package mbti.demo.service;

import lombok.RequiredArgsConstructor;
<<<<<<< HEAD
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
=======
import mbti.demo.domain.Member;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService implements LoginInterface{
    private final MemberServiceInterface memberServiceInterface;

    @Override
    public Member login(String loginId, String password) {
        return memberServiceInterface.findByLoginId(loginId)
                .filter(m->m.getPassword().equals(password))
                .orElse(null);
>>>>>>> jun/master
    }
}
