package mbti.demo.service;

import lombok.RequiredArgsConstructor;
import mbti.demo.domain.Drama;
import mbti.demo.repository.DramaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class DramaService implements DramaServi{

    private final DramaRepository dramaRepository;

    public List<Drama> getAllDramas() {
        return dramaRepository.getAllDramas();
    }
}
