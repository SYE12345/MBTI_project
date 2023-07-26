package mbti.demo.web;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Cultural;
import mbti.demo.service.CulturalServi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class cultureController {

    private final CulturalServi culturalServi;

    @GetMapping("/culture")
    public String culture(Model model){
        List<Cultural> culture = culturalServi.getAllCultural();
        model.addAttribute("culture",culture);
        return "/kakaover4";
    }
}
