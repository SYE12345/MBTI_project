package mbti.demo.repository;

import lombok.Data;

@Data
public class MovieSearchCond {

    private String genre;

    public MovieSearchCond(){
    }

    public MovieSearchCond(String genre) {
        System.out.println("서비스 실행");
        this.genre = genre;
    }
}
