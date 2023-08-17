package mbti.demo.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.BestBook;
import mbti.demo.service.BestBookService;
import mbti.demo.service.BestBookServiceInterface;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@RequestMapping("/best")
@Controller
@RequiredArgsConstructor
public class BestBookController {

    private final BestBookService bookService;
    private final BestBookServiceInterface bestbookServiceInterface;

    @GetMapping("/findAll")
    public String findAll(Model model) {
        List<BestBook> BestBook = bestbookServiceInterface.findAll();
        model.addAttribute("BestBook",BestBook);
        return "book/best";
    }

}

