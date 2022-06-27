package org.brightly;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PathParam;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public String hello() {
        return "Hello Spring";
    }

    @GetMapping("/{name}")
    public String helloName(@PathParam("name") String name) {
        return "Hello "+name+", Welcome to Quarkus World !!";
    }
}
