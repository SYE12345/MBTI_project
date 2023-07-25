package mbti.demo.service;

<<<<<<< HEAD
import mbti.demo.domain.Information;
import mbti.demo.repository.InformationInterface;
import lombok.RequiredArgsConstructor;
=======
import lombok.RequiredArgsConstructor;
import mbti.demo.domain.Information;
import mbti.demo.repository.InformationInterface;
>>>>>>> jun/master
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InformationService implements InformationServiceInterface{
    private final InformationInterface informationInterface;

    @Override
    public Information save(Information information){
        return informationInterface.save(information);
    }

    @Override
    public List<Information> findAll(){
        return informationInterface.findAll();
    }
}
