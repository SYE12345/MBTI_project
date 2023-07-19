package mbti.demo.domain;

import lombok.Data;

@Data
public class Museum {

    private String institution;
    private String title2;
    private String resource;
    private String subtitle;


    @Override
    public String toString() {
        return "Museum{" +
                "institution=" + institution +
                ", title2='" + title2 + '\'' +
                ", resource='" + resource + '\'' +
                ", endDay='" + subtitle + '\'' +
                '}';
    }
}



