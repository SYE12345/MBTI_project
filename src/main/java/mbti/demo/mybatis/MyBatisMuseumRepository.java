package mbti.demo.mybatis;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.repository.MuseumRepository;
import mbti.demo.domain.Museum;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MyBatisMuseumRepository implements MuseumRepository {
    private final MuseumMapper museumMapper;

    @Override
    public List<Museum> getAllMuseums() {
        return museumMapper.getAllMuseums();
    }
}
