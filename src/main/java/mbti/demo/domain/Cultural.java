package mbti.demo.domain;

import lombok.Data;

@Data
public class Cultural {

    private String title3;
    private String time1;
    private String place2;
    private String pay;
    private String subtitle2;


    @Override
    public String toString() {
        return "Cultural{" +
                "title3=" + title3 +
                ", time='" + time1 + '\'' +
                ", place2='" + place2 + '\'' +
                ", pay='" + pay + '\'' +
                ", subtitle2='" + subtitle2 + '\'' +
                '}';
    }
}



