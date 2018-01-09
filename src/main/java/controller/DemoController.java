package controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xavimo on 2018/1/9.
 */
@RestController
public class DemoController {
    @RequestMapping(value = "/demo")
    public String demo() {
        return "Hello world";
    }
}
