package mbti.demo.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Information;
import mbti.demo.service.InformationService;
import mbti.demo.service.InformationServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
@Slf4j
@RequiredArgsConstructor
public class InformationController {
    private final InformationServiceInterface informationServiceInterface;

    @GetMapping("/")
    public String All_list(Model model){
        List<Information> information = informationServiceInterface.findAll();
        model.addAttribute("information",information);
        return "/popup_test";
    }
}
