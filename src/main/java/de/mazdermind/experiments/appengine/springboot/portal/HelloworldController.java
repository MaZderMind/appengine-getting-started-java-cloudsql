package de.mazdermind.experiments.appengine.springboot.portal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
  @GetMapping("/")
  public String hello() {
    return "Hello world - springboot-appengine-standard!";
  }
}
