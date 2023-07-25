<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @PostMapping("/register")
    public String registerUser(@RequestParam String username,
                               @RequestParam String email,
                               @RequestParam String password,
                               @RequestParam String confirmPassword,
                               Model model) {

        // 비밀번호 확인
        if (!password.equals(confirmPassword)) {
            model.addAttribute("error", "비밀번호가 일치하지 않습니다.");
            return "register"; // 에러가 발생하면 다시 회원가입 폼으로 돌아갑니다.
        }

        // TODO: ID 중복 확인 로직 구현
        boolean isIdDuplicated = checkIfIdIsDuplicated(username);
        if (isIdDuplicated) {
            model.addAttribute("error", "이미 사용 중인 아이디입니다.");
            return "register"; // 에러가 발생하면 다시 회원가입 폼으로 돌아갑니다.
        }

        // TODO: 사용자 정보를 데이터베이스에 저장하는 로직 구현
        saveUserData(username, email, password);

        // 가입 성공 시, 로그인 페이지로 이동하도록 합니다.
        return "redirect:/login";
    }

    // ID 중복 확인 로직
    private boolean checkIfIdIsDuplicated(String username) {
        // 여기에 데이터베이스 조회 등의 로직을 추가합니다.
        // 중복된 아이디가 있는지 확인하여 true 또는 false를 반환합니다.
        return false; // 임시로 false를 반환하도록 합니다.
    }

    // 사용자 정보 저장 로직
    private void saveUserData(String username, String email, String password) {
        // 여기에 데이터베이스에 사용자 정보를 저장하는 로직을 추가합니다.
        // 데이터베이스에 사용자 정보를 삽입하는 INSERT 쿼리를 실행합니다.
    }
=======
package mbti.demo.web;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import mbti.demo.domain.Member;
import mbti.demo.repository.SessionConst;
import mbti.demo.service.LoginInterface;
import mbti.demo.service.MemberServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Data
@Controller
@RequiredArgsConstructor
public class LoginController {
    private final MemberServiceInterface memberServiceInterface;
    private final LoginInterface loginInterface;

    @GetMapping("/login")
    public String loginForm(@ModelAttribute("loginForm") LoginForm form) {
        return "login/login";
    }

    @PostMapping("/login")
    public String login(@Valid  @ModelAttribute LoginForm form, BindingResult bindingResult, HttpServletRequest request) {
        if(bindingResult.hasErrors()){
            return "login/loginForm";
        }
        Member loginMember = loginInterface.login(form.getLoginId(), form.getPassword());

        if (loginMember == null) {
            bindingResult.rejectValue("password","fail login","아이디 또는 비밀번호가 바르지 않습니다.");
            return "login/login";
        }


        HttpSession session = request.getSession();

        session.setAttribute(SessionConst.LOGIN_MEMBER, loginMember);

        return "redirect:/";
    }

    @PostMapping("/logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return "redirect:/";
    }

    @GetMapping("/find_id")
    public String find_LoginId_Form(@ModelAttribute("member") findLoginIdForm form){
        return "login/find_LoginId";
    }

    @PostMapping("/find_id")
    public String find_Loginid(@RequestParam("name") String name, @RequestParam("email") String email, Model model){
        Member result = memberServiceInterface.findByNameEmail(name, email).get();
        model.addAttribute("member", result);
        return "login/find_LoginId_result";

    }

    @GetMapping("/find_pw")
    public String find_PassWord_Form(@ModelAttribute("member") findPasswordForm form){
        return  "login/find_pw";
    }

    @PostMapping("/find_pw")
    public String find_PassWord(@RequestParam("loginId") String loginId,@RequestParam("name") String name, @RequestParam("email") String email, Model model){
        Member result = memberServiceInterface.findPasswordNameEmail(loginId, name, email).get();
        model.addAttribute("member", result);
        return "login/find_pw_result";
    }




>>>>>>> jun/master
}
