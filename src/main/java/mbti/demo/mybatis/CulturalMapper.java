package mbti.demo.mybatis;

import mbti.demo.domain.Cultural;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CulturalMapper {
    List<Cultural> getAllCultural();
}
