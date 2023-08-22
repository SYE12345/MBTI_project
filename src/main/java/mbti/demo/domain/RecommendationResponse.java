package mbti.demo.domain;

import lombok.Data;

import java.util.List;

@Data
public class RecommendationResponse {
    private List<List<Object>> recommendations;
    @Data
    public static class Recommendation {
        private String movieName;
        private double similarityScore;
    }
}

