package in.laksys;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class HelloController {
  @GetMapping
  public String sayHello(){
    return "Welcome to public page!";
  }
  @GetMapping("/admin")
  public String adminPage(){
    return "WElcome to Admin page!";
  }
  @GetMapping("/user")
  public String userPage(){
    return "WElcome to User page!";
  }
}

