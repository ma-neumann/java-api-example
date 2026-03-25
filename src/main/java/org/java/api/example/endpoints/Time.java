package org.java.api.example.endpoints;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Time {

	  @RequestMapping(path = "/v1/time")
	  public LocalTime time_v1() {
		  return LocalTime.now();
	  }

	  @RequestMapping(path = "/v2/time") // potentially breaking change
	  public LocalTime time_v2() {
		  Clock timeZone = Clock.system(ZoneId.of("America/Chicago"));
		  
		  return LocalTime.now(timeZone);
	  } 

	  @RequestMapping(path = "/v3/time") // clearly breaking change
	  public LocalTime time_v3(@RequestParam(value = "timezone") String tz) {
		  Clock timeZone = Clock.system(ZoneId.of(tz));
		  
		  return LocalTime.now(timeZone);
	  } 
	  
}
