package mbti.demo.mybatis;

import mbti.demo.domain.Drama;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DramaMapper {
    List<Drama> getAllDramas();
}
