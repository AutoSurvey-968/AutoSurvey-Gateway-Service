package com.revature.autosurvey.gateway;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

  @GetMapping(value="error")
  public ResponseEntity<String> handleError() {

    return ResponseEntity.status(500).body("Service is currently down, please try again in a few minutes.");
  }
}
