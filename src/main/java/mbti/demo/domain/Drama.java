package mbti.demo.domain;
import lombok.Data;
@Data
public class Drama {
    private String numb;
    private String title1;
    private String startDay;
    private String endDay;
    private String place1;
    private String genre;
    private String company;

    @Override
    public String toString() {
        return "Drama{" +
                "numb=" + numb +
                ", title1='" + title1 + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", place1='" + place1 + '\'' +
                ", genre='" + genre + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}

