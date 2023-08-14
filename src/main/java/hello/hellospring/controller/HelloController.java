package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")    // GET/POSt
    public String hello(Model model){   // Spring이 model 생성 후 넘김
        model.addAttribute("data", "hello!");
        return "hello";     /* templates - hello.html 파일을 찾아서 렌더링
                               Controller에서 리턴 값으로 문자를 반환하면 viewResolver가 화면을 찾아서 처리
                               resources:templates / + {ViewName} + .html
                            */
    }
}
