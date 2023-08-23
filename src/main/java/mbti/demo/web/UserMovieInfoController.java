package mbti.demo.web;

import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.UserMovieInfo;
import mbti.demo.repository.UserMovieInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
@Slf4j
@Controller
public class UserMovieInfoController {

    @Autowired
    private UserMovieInfoRepository userMovieInfoRepository;

    @PostMapping("/save-user-movie-info")
    @ResponseBody
    public String saveUserMovieInfo(@RequestBody UserMovieInfoRequest request) {
        log.info("aaaaaaa",request);
        UserMovieInfo userMovieInfo = new UserMovieInfo();
        userMovieInfo.setInformation(request.getInformation());

        userMovieInfoRepository.save(userMovieInfo);

        return "User movie information saved successfully.";
    }
}

class UserMovieInfoRequest {
    private String information;

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}