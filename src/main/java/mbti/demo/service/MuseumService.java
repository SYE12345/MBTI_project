package mbti.demo.service;

import lombok.RequiredArgsConstructor;
import mbti.demo.domain.Cinema;
import mbti.demo.domain.Museum;
import mbti.demo.repository.CinemaRepository;
import mbti.demo.repository.MuseumRepository;
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
