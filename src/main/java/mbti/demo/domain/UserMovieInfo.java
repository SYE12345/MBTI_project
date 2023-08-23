package mbti.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "movieuser")
public class UserMovieInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movieuser_id_seq")
    @SequenceGenerator(name = "movieuser_id_seq", sequenceName = "movieuser_id_seq", allocationSize = 1)
    private Long user_id;
    private String information;

    public Long getId() {
        return user_id;
    }

    public void setId(Long id) {
        this.user_id = id;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}