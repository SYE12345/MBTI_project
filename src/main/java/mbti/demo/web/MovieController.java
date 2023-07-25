//package mbti.demo.web;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import mbti.demo.domain.Movie;
//import mbti.demo.service.MovieServiceInterface;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Slf4j
//@Controller
//@RequiredArgsConstructor
//public class MovieController {
//    private final MovieServiceInterface movieServiceInterface;
//
////    @GetMapping("/")
////    public String test2(){
//////        log.info(movieServiceInterface.findByGenre("액션")+"");
////        log.info(movieServiceInterface.findAll()+"");
////        return "index";
////    }
//
//    @GetMapping("/")
//    public String test2(){
////        log.info(movieServiceInterface.findByGenre()+"");
//        log.info(movieServiceInterface.findAll()+"");
//        return "index";
//    }
//
////    @GetMapping("/") //@PathVariable long itemId,
////    public String movie(Model model) {
////        Movie movie = movieServiceInterface.findByGenre("액션").get();
////        model.addAttribute("movie", movie);
////        return "/index";
////
////    }
//
//}
