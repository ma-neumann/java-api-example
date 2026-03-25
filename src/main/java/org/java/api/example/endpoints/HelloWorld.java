package org.java.api.example.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class HelloWorld {

  @RequestMapping(path = "/greeting")
  public String greet() {
    return "Hello World";
  }

}
