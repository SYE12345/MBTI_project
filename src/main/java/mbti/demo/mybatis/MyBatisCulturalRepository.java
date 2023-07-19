package mbti.demo.mybatis;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Cultural;
import mbti.demo.repository.CulturalRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MyBatisCulturalRepository implements CulturalRepository {
    private final CulturalMapper culturalMapper;

    @Override
    public List<Cultural> getAllCultural() {
        return culturalMapper.getAllCultural();
    }
}
