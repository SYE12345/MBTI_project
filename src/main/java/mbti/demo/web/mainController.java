package mbti.demo.web;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import mbti.demo.domain.Member;
import mbti.demo.repository.SessionConst;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class mainController {
    @GetMapping("/")
    public String home (HttpServletRequest request, Model model){
        HttpSession session = request.getSession(false);

        if(session==null){
            return "main/main";
        }
        Member loginMember = (Member)session.getAttribute(SessionConst.LOGIN_MEMBER);
        if(loginMember == null){
            return "main/main";
        }
        model.addAttribute("member",loginMember);
        return "main/main_login";
    }

}
