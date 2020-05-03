package space.banka.alyona.e_hunter.product_server.entrypoints.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/greet/{name}")
    public String greet(@PathVariable("name") String name) {
        return "Привет, " + name;
    }
}
