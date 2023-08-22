package mbti.demo.web;

import mbti.demo.domain.RecommendationResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class MovieRecommendationController {

    @GetMapping("/display_recommendations")
    public String displayRecommendations(Model model) {
        String flaskServerUrl = "http://localhost:5000/get_recommendations";
        RestTemplate restTemplate = new RestTemplate();
        RecommendationResponse response = restTemplate.getForObject(flaskServerUrl, RecommendationResponse.class);

        if (response != null) {
            List<List<Object>> recommendations = response.getRecommendations();
            model.addAttribute("recommendations", recommendations);
            return "recommendations";  // 추천 영화 목록을 표시할 페이지로 이동
        } else {
            model.addAttribute("error", "No recommendations available.");
            return "error";  // 에러 화면으로 이동
        }
    }
}