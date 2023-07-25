package mbti.demo.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Book;
import mbti.demo.service.BookServiceInterface;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/book")
@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookServiceInterface bookServiceInterface;


    @GetMapping("/AnalystType")
    public String findByAnalystType(@PageableDefault(size=10, sort = "title") Pageable pageable, Model model) {
        Page<Book> bookPage = bookServiceInterface.findByAnalystType(pageable);
        model.addAttribute("bookPage",bookPage);
        return "book/book1";
    }

    @GetMapping("/DiplomaticType")
    public String findByDiplomaticType(@PageableDefault(size=10, sort = "title") Pageable pageable, Model model){
        Page<Book> bookPage = bookServiceInterface.findByDiplomaticType(pageable);
        model.addAttribute("bookPage",bookPage);
        return "book/book2";
    }

    @GetMapping("/AdministratorType")
    public String findByAdministratorType(@PageableDefault(size=10, sort = "title") Pageable pageable, Model model){
        Page<Book> bookPage = bookServiceInterface.findByAdministratorType(pageable);
        model.addAttribute("bookPage",bookPage);
        return "book/book3";
    }

    @GetMapping("/ExplorerType")
    public String findByExplorerType(@PageableDefault(size=10, sort = "title") Pageable pageable, Model model){
        Page<Book> bookPage = bookServiceInterface.findByExplorerType(pageable);
        model.addAttribute("bookPage",bookPage);
        return "book/book4";
    }


//    @GetMapping("/")
//    public String findAll() {
//        log.info(bookService.findAll()+"");
//        return "/index";
//    }

}

