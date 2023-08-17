package mbti.demo.repository;

import mbti.demo.domain.Food;
import mbti.demo.domain.Museum;

import java.util.List;

public interface FoodRepository {

    List<Food> getAllFoods();
}
