package life.majiang.community.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//哇允许这个类去接受前端的一个请求
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
//    public String hello(@RequestParam(name = "name") String name, Model model){
//        model.addAttribute("name",name);
//        return "index";
//    }

}
