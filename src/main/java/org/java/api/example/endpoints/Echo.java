package org.java.api.example.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Echo {

  @RequestMapping(path = "/echo")
  public String echo(@RequestParam(value = "input") String input) {
	  String output = "You gave me: " + input;
	  
	  return output;
  }
 
}