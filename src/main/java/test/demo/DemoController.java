package test.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @GetMapping
    @RequestMapping("test1")
    public String test1() {
        log.info("test1");
        return "Hello world";
    }

    @GetMapping
    @RequestMapping("test2")
    public String test2() {
        log.info("test2");
        return "Hello world";
    }

    @GetMapping
    @RequestMapping("test3")
    public String test3() {
        log.info("test3");
        throw new RuntimeException("exc");
    }

}
