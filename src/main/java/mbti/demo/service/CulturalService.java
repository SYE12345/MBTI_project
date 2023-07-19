package mbti.demo.service;

import lombok.RequiredArgsConstructor;
import mbti.demo.domain.Cultural;
import mbti.demo.repository.CulturalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CulturalService implements CulturalServi{

    private final CulturalRepository culturalRepository;

    public List<Cultural> getAllCultural() {
        return culturalRepository.getAllCultural();
    }
}
