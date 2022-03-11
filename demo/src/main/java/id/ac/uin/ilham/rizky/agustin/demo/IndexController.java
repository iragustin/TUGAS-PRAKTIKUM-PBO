package id.ac.uin.ilham.rizky.agustin.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class IndexController {
    @GetMapping("/hello")
    public String hello(){
        return "Selamat belajar Spring-Boot!";
    }
}
