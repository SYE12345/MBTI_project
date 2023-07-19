package mbti.demo.mybatis;

import mbti.demo.domain.Museum;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MuseumMapper {
    List<Museum> getAllMuseums();
}
