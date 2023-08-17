package mbti.demo.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Information;

import mbti.demo.domain.MbtiVO;
import mbti.demo.mybatis.MbtiMapper;
import mbti.demo.service.InformationServiceInterface;
import mbti.demo.service.MbtiInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
@Slf4j
@RequiredArgsConstructor
public class InformationController {
    private final InformationServiceInterface informationServiceInterface;
    private final MbtiInterface mbtiInterface;


    @GetMapping("/about")
    public String All_list(Model model){
        List<Information> information = informationServiceInterface.findAll();
        List<MbtiVO> mbti = mbtiInterface.getAll();
        model.addAttribute("information",information);
        model.addAttribute("mbti",mbti);
        return "mbti_Information";

//   @GetMapping("/about")
//    public String All_list(Model model){
//            List<Information> information = informationServiceInterface.findAll();
//            model.addAttribute("information", information);
//            return "mbti_information";
//        }
    }
}
