package mbti.demo.mybatis;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.repository.DramaRepository;
import mbti.demo.domain.Drama;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MyBatisDramaRepository implements DramaRepository {
    private final DramaMapper dramaMapper;

    @Override
    public List<Drama> getAllDramas() {
        return dramaMapper.getAllDramas();
    }
}
