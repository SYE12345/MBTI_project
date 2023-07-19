package mbti.demo.service;

import lombok.RequiredArgsConstructor;
import mbti.demo.repository.MuseumRepository;
import mbti.demo.domain.Museum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MuseumService implements MuseumServi{

    private final MuseumRepository museumRepository;

    public List<Museum> getAllMuseums() {
        return museumRepository.getAllMuseums();
    }
}
